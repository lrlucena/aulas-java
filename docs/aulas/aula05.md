# ⌨️ Aula 05 - Entrada e Saída

Aprenda a ler dados do teclado e exibir resultados no console usando Java.

---

## 📤 **Saída Padrão (Console)**

### **Métodos Básicos**
| Método                 | Descrição                          |
|------------------------|------------------------------------|
| `System.out.print()`   | Exibe texto sem quebra de linha.   |
| `System.out.println()` | Exibe texto com quebra de linha.   |
| `System.out.printf()`  | Formata saída (similar ao C).      |

---

### 🎨 **Formatação Avançada com `printf`**
| Especificador | Tipo          | Exemplo         |
|---------------|---------------|-----------------|
| `%d`          | Inteiro       | `%05d` → 00042 |
| `%f`          | Decimal       | `%.2f` → 3.14  |
| `%s`          | String        | `%-10s` → alinhado à esquerda |
| `%n`          | Quebra linha  | `"Linha1%nLinha2"` |

```java
double preco = 19.9876;
System.out.printf("Preço: R$ %,.2f%n", preco); // Preço: R$ 19,99
```

```java
public class Saida {
    public static void main(String[] args) {
        System.out.print("Olá, ");        // Sem quebra
        System.out.println("Mundo!");     // Com quebra
        System.out.printf("PI: %.2f", Math.PI); // PI: 3.14
    }
}
```

---

## 📥 **Entrada com `Scanner`**

### **Passo 1: Importar a Classe**
```java
import java.util.Scanner;
```

### **Passo 2: Criar um Objeto Scanner**
```java
Scanner leitor = new Scanner(System.in);
```

### **Passo 3: Ler Dados**
| Método           | Tipo Lido          |
|------------------|--------------------|
| `nextInt()`      | `int`              |
| `nextDouble()`   | `double`           |
| `nextLine()`     | `String` (linha)   |
| `next().charAt(0)` | `char` (primeiro caractere) |

```java
public class Entrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.print("Idade: ");
        int idade = leitor.nextInt();
        
        System.out.printf("%s tem %d anos.", nome, idade);
        leitor.close(); // Fechar o scanner!
    }
}
```

---

## Funcionamento do Scanner

A classe **`Scanner`** em Java é uma ferramenta versátil para ler e analisar dados de fluxos de entrada, como `System.in` (entrada padrão, geralmente o teclado). Ela simplifica a leitura de dados primitivos e strings, tokenizando a entrada de acordo com delimitadores específicos. Vamos entender passo a passo como ela lida com `System.in`:

---

### **1. Como o `Scanner` se Conecta ao `System.in`**
- **`System.in`** é um objeto do tipo `InputStream` que representa a entrada padrão (teclado).
- Ao criar um `Scanner`, você o associa a `System.in`:
  ```java
  Scanner scanner = new Scanner(System.in);
  ```
- O `Scanner` lê dados do buffer de entrada, que é preenchido quando o usuário pressiona **Enter**.

---

### **2. Tokenização da Entrada**
O `Scanner` divide a entrada em **tokens** usando um delimitador padrão (espaço em branco, tabulação ou quebra de linha). Exemplo:
- **Entrada**: `"João 25 70.5"`  
- **Tokens**: `"João"`, `"25"`, `"70.5"`.

---

### **3. Métodos para Ler Dados**
O `Scanner` oferece métodos para ler tokens específicos:

| Método           | Tipo Lido          | Comportamento                                                                 |
|------------------|--------------------|-------------------------------------------------------------------------------|
| `nextInt()`      | `int`              | Lê o próximo token como `int`. Ignora espaços antes do token.                 |
| `nextDouble()`   | `double`           | Lê o próximo token como `double`.                                             |
| `next()`         | `String`           | Lê o próximo token até o delimitador.                                         |
| `nextLine()`     | `String`           | Lê **toda a linha** até a quebra de linha (`\n`).                             |
| `hasNextInt()`   | `boolean`          | Verifica se o próximo token pode ser lido como `int`.                         |

---

### **4. Funcionamento do Buffer**
- Quando o usuário digita `"42\n"` (número + Enter), o buffer contém `"42\n"`.
- **`nextInt()`**: Lê `42` e **deixa `\n` no buffer**.
- **`nextLine()`**: Lê o `\n` restante, resultando em uma string vazia (`""`).

#### **Exemplo de Problema Comum**:
```java
Scanner scanner = new Scanner(System.in);

System.out.print("Idade: ");
int idade = scanner.nextInt(); // Lê o número, deixa o '\n' no buffer

System.out.print("Nome: ");
String nome = scanner.nextLine(); // Lê o '\n' residual → nome = ""
```

#### **Solução**:
Após métodos como `nextInt()`, consuma o `\n` residual com `nextLine()`:
```java
int idade = scanner.nextInt();
scanner.nextLine(); // Consome o '\n'
```

---

### **5. Gerenciamento de Exceções**
O `Scanner` pode lançar exceções se o input não corresponder ao tipo esperado:
- **`InputMismatchException`**: Quando o token não pode ser convertido (ex: letras para `nextInt()`).
- **Solução**: Use `hasNextInt()`, `hasNextDouble()`, etc., para verificar antes de ler:
  ```java
  if (scanner.hasNextInt()) {
      int numero = scanner.nextInt();
  } else {
      System.out.println("Número inválido!");
  }
  ```

---

### **6. Fechando o `Scanner`**
Sempre feche o `Scanner` após o uso para liberar recursos (embora `System.in` não seja fechado permanentemente):
```java
scanner.close();
```

---

### **Exemplo Completo**
```java
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer
        
        System.out.printf("Nome: %s, Idade: %d, Peso: %.1f kg", nome, idade, peso);
        
        scanner.close();
    }
}
```

---

### **Resumo**
- **Tokenização**: Divide a entrada em partes usando delimitadores.
- **Buffer Management**: Cuidado com resíduos de `\n` após métodos como `nextInt()`.
- **Validação**: Use `hasNext...()` para evitar exceções.
- **Fechamento**: Sempre feche o `Scanner` para evitar vazamentos.

Entender esses detalhes ajuda a evitar erros comuns e a criar interações de entrada mais robustas! 😊

---

## 🆕 **Entrada com `Console`**
Alternativa mais segura para senhas (não ecoa caracteres):

```java
import java.io.Console;

public class ConsoleExemplo {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("Console não disponível!");
            return;
        }
        
        String usuario = console.readLine("Usuário: ");
        char[] senha = console.readPassword("Senha: ");
        console.printf("Bem-vindo, %s!", usuario);
    }
}
```

---

## 🧪 **Exercícios Práticos**
1. **Calculadora Simples**:  
   Leia dois números e exiba a soma, subtração e multiplicação.

2. **Formulário de Cadastro**:  
   Leia nome, email e idade, e exiba os dados formatados.

3. **Conversor de Temperatura**:  
   Leia graus Celsius e converta para Fahrenheit (F = C * 1.8 + 32).
