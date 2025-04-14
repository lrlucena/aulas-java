---
title: Aula 04 - 📦 Variáveis
subtitle: Armazenando Dados
---

Variáveis são containers para armazenar dados em memória. Nesta aula, você aprenderá a declarar, inicializar e usar variáveis de forma eficaz.

---

## 📌 **O Que São Variáveis?**
- **Definição**: Espaço nomeado na memória que armazena um valor durante a execução do programa.
- **Características**:
  - Possuem **tipo** (define o tipo de dado).
  - Possuem **nome** (identificador).
  - Podem ter seu valor alterado (exceto constantes).

---

## 🔧 **Declaração e Inicialização**

### Sintaxe Básica:
```java
tipo nomeDaVariavel = valor;
```

### Exemplo:
```java
int idade = 25;                // Declaração + inicialização
double salario;                // Declaração (não inicializada)
salario = 4500.50;             // Inicialização posterior
```

---

## 🧩 **Tipos de Variáveis**

### 1. **Primitivas**  
Armazenam valores diretamente. Tipos principais:

| Tipo      | Exemplo       | Tamanho  | Valor Padrão |
|-----------|---------------|----------|--------------|
| `int`     | `42`          | 32 bits  | 0            |
| `double`  | `3.14`        | 64 bits  | 0.0          |
| `boolean` | `true`/`false`| 1 bit    | false        |
| `char`    | `'A'`         | 16 bits  | `\u0000`     |

### 2. **Referência**  
Armazenam endereços de memória (objetos):
```java
String nome = "Java";    // Referência a um objeto String
Scanner scanner = new Scanner(System.in); 
```

---

## 🌐 **Escopo de Variáveis**

| Tipo               | Onde Vive?               | Exemplo                   |
|--------------------|--------------------------|---------------------------|
| **Local**          | Dentro de um método/bloco| `void metodo() { int x; }`|
| **Instância**      | Dentro de um objeto      | `class Pessoa { int idade; }` |
| **Classe (static)**| Pertence à classe        | `static int contador;`    |

```java
public class ExemploEscopo {
    static int variavelClasse = 10;   // static
    
    public void metodo() {
        int variavelLocal = 20;       // local
        System.out.println(variavelClasse + variavelLocal); // 30
    }
}
```

---

## 🆕 **Inferência de Tipo com `var` (Java 10+)**
Java permite declarar variáveis locais sem especificar o tipo explicitamente:
```java
var nome = "Java";           // Inferido como String
var lista = new ArrayList<String>(); // ArrayList<String>
var idade = 25;              // Inferido como int
```

### Limitações do `var`:
- Só funciona para **variáveis locais**.
- Não pode ser usado em parâmetros ou campos de classe.

---

## 🔒 **Constantes (`final`)**
Variáveis que não podem ser alteradas após a inicialização:
```java
final double PI = 3.1415926535;
final String NOME_CURSO = "POO com Java";
```

### Boas Práticas:
- Use nomes em **MAIÚSCULAS** para constantes.
- Inicialize no momento da declaração.

---

## ⚠️ **Erros Comuns**
1. **Usar variável não inicializada**:
   ```java
   int x;
   System.out.println(x); // Erro de compilação!
   ```

2. **Confundir tipos**:
   ```java
   int numero = 10.5; // Erro: double não cabe em int
   ```

3. **Esquecer que objetos são referências**:
   ```java
   String s1 = new String("Java");
   String s2 = new String("Java");
   System.out.println(s1 == s2); // false (compara endereços)
   ```

---

## 🧪 **Exercícios Práticos**
1. **Conversor de Moeda**:
   - Declare uma constante `TAXA_CAMBIO = 5.30` (BRL para USD).
   - Leia um valor em reais e converta para dólares.

2. **Calculadora de IMC**:
   - Use variáveis para peso (kg) e altura (m).
   - Calcule e exiba o IMC (peso / altura²).

3. **Gerenciador de Contatos**:
   - Crie uma classe `Contato` com variáveis de instância `nome` e `telefone`.

---

```admonition tip "Dica"
Use `var` para simplificar código com tipos óbvios, mas prefira tipos explícitos em casos ambíguos!
```
