# Aula 02 - 🖥️ Como o Java Funciona 

Java é uma linguagem **compilada e interpretada**, combinando eficiência com portabilidade.

---

## 🔄 Arquitetura do Java  

```mermaid
flowchart LR
    A[Código Fonte .java] --> B[javac]
    B --> C[Bytecode .class]
    C --> D[JVM]
    D --> E[Execução]
```

---

## 📌 Componentes Principais  

### 1. **Java Virtual Machine (JVM)**  
- **Função**: Interpreta o bytecode e o executa no sistema operacional.  
- **Recursos**:
  - Garbage Collector (gerencia memória).  
  - JIT Compiler (otimiza código em tempo de execução).  
  - Suporte a múltiplas plataformas (Windows, Linux, macOS).  

### 2. **Bytecode**

- **Formato intermediário**: Resultado da compilação do `.java`.  
- **Vantagem**: Portável ("Write Once, Run Anywhere").  

### 3. **Processo de Compilação**  

1. **Compilação** (`javac`):  
   ```bash
   javac Programa.java  # Gera Programa.class
   ```  

2. **Execução** (`java`):  
   ```bash
   java Programa  # Carrega a classe na JVM
   ```  

---

## 🚀 Exemplo Prático em Java

### Código Fonte: `Hello.java`  

```java
// Classe principal
public class Hello {
    public static void main(String[] args) {
        var mensagem = StringTemplate.STR."Bem-vindo(a) à POO com Java \{System.getProperty("java.version")}!";
        System.out.println(mensagem);
    }
}
```

### Passo a Passo:  

1. **Compilação**:  
   ```bash
   javac Hello.java
   ```  
   - Gera `Hello.class` (bytecode).  

2. **Execução**:  
   ```bash
   java Hello
   ```  
   - Saída:  
     ```
     Bem-vindo(a) à POO com Java 25!
     ```  

---

## 🔍 O Que Acontece nos Bastidores?  

### Fases da JVM:  

1. **Carregamento de Classes**:  
    JVM lê `.class` e carrega a classe `Hello`.  

2. **Verificação de Bytecode**:  
    Garante segurança (ex: sem acesso ilegal à memória).

3. **Compilação JIT (Just-In-Time)**:  
   Converte trechos de bytecode para código nativo da máquina.  

4. **Execução**:

5. **Garbage Collection**:  
   Limpa objetos não usados (ex: instâncias temporárias).  

---

## ❓ Perguntas Frequentes  

### Por que o Java não é totalmente compilado para código nativo?  

- **Vantagem**: Bytecode permite portabilidade. Compilação JIT equilibra performance e flexibilidade.  

### Como a JVM otimiza o código?  

- **Exemplo**: Se um loop é executado muitas vezes, o JIT o compila para código nativo, acelerando execuções futuras.  

---

Para ver o bytecode gerado, use:  

```bash
javap -c HelloPOO.class  
```  

```java
Compiled from "Hello.java"
public class Hello {
  public Hello();
    Code:
       0: aload_0
       1: invokespecial #1             // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2             // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #3             // String Ola Mundo
       5: invokevirtual #4             // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}
```

---

## 📚 Leitura Recomendada  

- [Documentação Oficial da JVM](https://docs.oracle.com/javase/specs/)
- [Java 25+ Features (OpenJDK)](https://openjdk.org/projects/jdk/25/)
