# Aula 01 - Linguagem Java

## Surgimento

Quando Java foi lançada em 1995, ela se destacou das outras linguagens de programação devido a várias características inovadoras. Aqui estão as principais que a diferenciaram na época:

### 1. **"Write Once, Run Anywhere" (WORA) – Portabilidade**
   - Java foi projetada para ser **independente de plataforma**, graças à **Java Virtual Machine (JVM)**.
   - O código Java é compilado para **bytecode**, que pode ser executado em qualquer dispositivo com uma JVM, sem necessidade de recompilação.
   - Isso foi revolucionário em comparação com linguagens como C e C++, que exigiam compilação específica para cada sistema operacional.

### 2. **Orientação a Objetos Pura (OOP)**
   - Java foi uma das primeiras linguagens a adotar **orientação a objetos de forma consistente** (com exceção dos tipos primitivos).
   - Recursos como **herança, encapsulamento e polimorfismo** foram implementados de maneira mais rígida do que em C++.

### 3. **Gerenciamento Automático de Memória (Garbage Collection)**
   - Java introduziu um **coletor de lixo (garbage collector)** que automaticamente liberava memória não utilizada.
   - Em linguagens como C e C++, o programador precisava gerenciar memória manualmente (com `malloc`/`free` ou `new`/`delete`), o que podia levar a vazamentos e erros.

### 4. **Segurança**
   - Java foi criada com foco em segurança, especialmente para execução de código remoto (como applets em navegadores).
   - A JVM tinha um **verificador de bytecode (bytecode verifier)** para evitar operações maliciosas.
   - Não havia ponteiros explícitos (como em C/C++), reduzindo riscos de acesso indevido à memória.

### 5. **Multithreading Integrado**
   - Java trouxe suporte nativo a **threads**, facilitando a programação concorrente.
   - Em outras linguagens, como C, o multithreading exigia bibliotecas externas ou chamadas específicas do sistema operacional.

### 6. **Ausência de Ponteiros Explícitos**
   - Java removeu a aritmética de ponteiros, presente em C/C++, evitando erros comuns como **corrupção de memória** e **acessos inválidos**.

### 7. **Biblioteca Padrão Rica (Java API)**
   - Java foi lançada com uma biblioteca robusta, incluindo:
     - Coleções (`java.util.*`)
     - Rede (`java.net.*`)
     - E/S (`java.io.*`)
     - Interface gráfica básica (`AWT`, depois `Swing`)

### 8. **Linguagem Simples (Comparada a C++)**
   - Java eliminou complexidades do C++, como:
     - Herança múltipla (substituída por interfaces).
     - Sobrecarga de operadores.
     - Templates (genéricos só foram adicionados posteriormente).

### 9. **Suporte a Rede e Internet**
   - Java foi criada na era da internet e trouxe recursos nativos para programação em rede, como sockets e HTTP.

### 10. **Applets (Inovação na Web)**
   - Os **applets Java** permitiam executar código dinâmico em navegadores, algo revolucionário nos anos 90 (antes do JavaScript dominar).

### Comparação com Linguagens da Época (1995):
| Característica       | Java | C/C++ | Pascal | Visual Basic | Perl/Python |
|----------------------|------|-------|--------|--------------|-------------|
| Portável (JVM)       | ✅   | ❌    | ❌     | ❌           | ✅ (interpretado) |
| Garbage Collection   | ✅   | ❌    | ❌     | ✅           | ✅          |
| Orientação a Objetos | ✅   | ✅ (C++)| ❌    | Parcial      | ✅ (Python) |
| Multithreading       | ✅   | ❌ (depende do SO)| ❌ | ❌      | ✅ (limitado) |
| Segurança            | ✅   | ❌    | ❌     | ❌           | ❌          |

### Conclusão:
Java se diferenciou por ser **portável, segura, orientada a objetos e com gerenciamento automático de memória**, combinando o melhor de linguagens como C++ e Smalltalk, enquanto eliminava suas complexidades. Isso a tornou ideal para a internet emergente e aplicações empresariais.

---

## Comparação Java x Python

A comparação entre **Java** e **Python** hoje envolve diferenças significativas em desempenho, sintaxe, ecossistema e casos de uso. Vamos analisar os principais aspectos:

---

### **1. Paradigma e Sintaxe**
| **Característica**       | **Java**                          | **Python**                        |
|--------------------------|-----------------------------------|-----------------------------------|
| **Paradigma**            | Orientado a objetos (rígido)      | Multiparadigma (OO, funcional, procedural) |
| **Sintaxe**              | Verbosa (exige tipos e `{}`)      | Concisa e legível (indentação obrigatória) |
| **Exemplo (Hello World)**| ```System.out.println("Hello");```| ```print("Hello")```              |
| **Tipagem**              | Estática e forte                  | Dinâmica e forte                  |

🔹 **Python** é mais fácil para scripts rápidos, enquanto **Java** exige mais estrutura.

---

### **2. Desempenho**
| **Característica**       | **Java**                          | **Python**                        |
|--------------------------|-----------------------------------|-----------------------------------|
| **Compilação**           | Bytecode (JVM)                    | Interpretado (com otimizações em CPython) |
| **Velocidade**           | Mais rápido (JIT da JVM)          | Mais lento (exceto com PyPy/Cython) |
| **Uso de Memória**       | Alto (JVM)                        | Geralmente menor                  |

🔹 **Java** é melhor para aplicações de alto desempenho (ex: sistemas financeiros).  
🔹 **Python** é suficiente para scripts, automação e prototipagem.

---

### **3. Ecossistema e Bibliotecas**
| **Área**                | **Java**                          | **Python**                        |
|--------------------------|-----------------------------------|-----------------------------------|
| **Web (Backend)**        | Spring, Jakarta EE                | Django, Flask, FastAPI            |
| **Ciência de Dados**     | Weka, Deeplearning4j             | Pandas, NumPy, TensorFlow, PyTorch |
| **Automação/DevOps**     | Maven, Gradle                     | Scripting nativo, Ansible         |
| **Mobile**               | Android (Kotlin está substituindo)| Kivy (pouco usado)                |

🔹 **Python** domina em **IA, dados e scripts**.  
🔹 **Java** é forte em **aplicações empresariais, bancos e Android**.

---

### **4. Concorrência e Multithreading**
| **Característica**       | **Java**                          | **Python**                        |
|--------------------------|-----------------------------------|-----------------------------------|
| **Threads**              | Nativo (mas pesado)               | Limitado pelo GIL (Global Interpreter Lock) |
| **Alternativas**         | Virtual Threads (Java 21+)        | Multiprocessamento (`multiprocessing`) ou async (asyncio) |

🔹 **Java** é melhor para aplicações concorrentes pesadas.  
🔹 **Python** sofre com o GIL, mas compensa com **assincronia** (FastAPI) ou processos paralelos.

---

### **5. Segurança e Manutenção**
| **Característica**       | **Java**                          | **Python**                        |
|--------------------------|-----------------------------------|-----------------------------------|
| **Verificação de Tipos** | Compilação rigorosa               | Erros só em runtime               |
| **Legado Corporativo**   | Muito usado em bancos e governo  | Mais comum em startups e pesquisa |

🔹 **Java** é mais seguro para sistemas críticos (ex: bancos).  
🔹 **Python** é ágil, mas pode esconder bugs até a execução.

---

### **6. Mercado de Trabalho**
| **Característica**       | **Java**                          | **Python**                        |
|--------------------------|-----------------------------------|-----------------------------------|
| **Demanda**              | Alta em empresas tradicionais     | Explosão em IA, dados e startups  |
| **Salários**             | Consistentes (especialmente em fintechs) | Altos em áreas de dados/ML |

🔹 **Java** ainda domina em vagas de **backend corporativo**.  
🔹 **Python** lidera em **ciência de dados e automação**.

---

### **Quando Usar Cada Um?**
- **Escolha Java se:**  
  - Precisar de alta performance e escalabilidade (ex: sistemas bancários).  
  - Desenvolver para **Android** (embora Kotlin seja preferido hoje).  
  - Trabalhar em grandes empresas com legado Java (ex: Oracle, IBM).  

- **Escolha Python se:**  
  - Prototipar rápido ou trabalhar com **dados/IA** (ML, análise de dados).  
  - Escrever scripts ou automações (DevOps, web scraping).  
  - Priorizar produtividade em vez de desempenho bruto.  

---

### **Conclusão**
- **Java** é **poderoso, estruturado e rápido**, mas exige mais código.  
- **Python** é **flexível e produtivo**, mas menos eficiente em performance pura.  

Ambos têm espaço no mercado, mas a escolha depende do **projeto** e do **contexto**. Se precisar de um meio-termo, linguagens como **Kotlin** (JVM) ou **Go** podem ser alternativas.

---

A linguagem **Java** passou por diversas mudanças significativas desde seu lançamento em 1996 até a versão **25 (JDK 25)**, prevista para setembro de 2025. Vamos explorar sua evolução, destacando as principais features e mudanças em cada versão:

---

## **Evolução**

### **📌 JDK 1.0 (1996) – O Começo**
- Primeira versão pública.
- **Principais recursos**:
  - Applets Java (para navegadores).
  - Biblioteca básica (AWT, IO, Threads).
  - JVM (Java Virtual Machine).

### **📌 JDK 1.1 (1997) – Melhorias Iniciais**
- **Inner Classes** (classes aninhadas).
- **JDBC** (conexão com bancos de dados).
- **RMI** (Remote Method Invocation).
- **Reflection API**.

### **📌 J2SE 1.2 (1998) – Java 2 Platform**
- Divisão em **J2SE, J2EE, J2ME**.
- **Collections Framework** (`List`, `Set`, `Map`).
- **Swing** (substituiu parcialmente AWT).
- **JIT Compiler** (melhor desempenho).

### **📌 J2SE 1.4 (2002) – Maturação**
- **Expressões Regulares** (`java.util.regex`).
- **NIO** (New I/O para operações não-bloqueantes).
- **Logging API** (`java.util.logging`).
- **Assertions** (`assert` keyword).

### **📌 Java 5 (2004) – Revolução (JDK 1.5)**
- **Generics** (`List<String>`).
- **Anotações** (`@Override`, `@Deprecated`).
- **Varargs** (`void method(String... args)`).
- **Enhanced for-loop** (`for (String s : list)`).
- **Enums** (`enum Season { SPRING, SUMMER }`).

### **📌 Java 6 (2006) – Estabilidade**
- **Scripting Engine** (suporte a linguagens como JavaScript via `javax.script`).
- **JDBC 4.0** (melhorias em conexão com bancos).
- **Java Compiler API** (programaticamente compilar código).

### **📌 Java 7 (2011) – Projeto Coin (pequenas melhorias)**
- **Strings em switch** (`switch (str) { ... }`).
- **Try-with-resources** (`try (FileInputStream fis = ...)`).
- **Diamond Operator** (`List<String> list = new ArrayList<>()`).
- **NIO.2** (`Files`, `Paths` para manipulação de arquivos).

### **📌 Java 8 (2014) – A Grande Revolução (Lambdas + Streams)**
- **Lambdas** (`(x, y) -> x + y`).
- **Stream API** (`list.stream().filter(...).map(...)`).
- **Optional** (evitar `NullPointerException`).
- **Default Methods** em interfaces (`default void log() { ... }`).
- **Nova API de Data/Hora** (`java.time`).

### **📌 Java 9 (2017) – Modularidade (Project Jigsaw)**
- **Módulos** (`module-info.java`).
- **JShell** (REPL interativo).
- **Factory Methods para Collections** (`List.of(1, 2, 3)`).

### **📌 Java 10 (2018) – Inferência de Tipo Local**
- **`var`** (`var list = new ArrayList<String>()`).

### **📌 Java 11 (2018) – LTS (Long-Term Support)**
- **HTTP Client** (API nativa `java.net.http`).
- **Remoção de recursos** (Applets, JavaFX separado).
- **`String::lines`, `isBlank()`**.

### **📌 Java 12-16 (2019-2021) – Novidades Incrementais**
- **Switch Expressions** (Java 14):
  ```java
  String dayType = switch (day) {
      case "MON", "TUE" -> "Weekday";
      default -> "Weekend";
  };
  ```
- **Records** (Java 16) – Classes imutáveis simplificadas:
  ```java
  record Person(String name, int age) {}
  ```
- **Text Blocks** (Java 15) – Strings multilinha:
  ```java
  String json = """
      { "name": "Java", "version": 15 }
  """;
  ```
- **Pattern Matching for `instanceof`** (Java 16):
  ```java
  if (obj instanceof String s) {
      System.out.println(s.length());
  }
  ```

### **📌 Java 17 (2021) – LTS (Atual Estável em 2024)**
- **Sealed Classes** (limita herança):
  ```java
  public sealed class Shape permits Circle, Square {}
  ```
- **Novo Garbage Collector (ZGC, Shenandoah)**.
- **`switch` com padrões (preview)**.

### **📌 Java 18-24 (2022-2024) – Novidades Contínuas**
- **Java 18**: UTF-8 por padrão, API de vetores (incubadora).
- **Java 19**: Virtual Threads (Project Loom – concorrência leve).
- **Java 20**: Scoped Values (alternativa a `ThreadLocal`).
- **Java 21 (LTS, 2023)**: Virtual Threads estáveis, `SequencedCollection`.
- **Java 22-24**: Melhorias incrementais em pattern matching, performance.

### **📌 Java 25 (Previsto para Set/2025) – O Que Esperar?**
- **Aprimoramento do Project Loom** (mais recursos para virtual threads).
- **Novas APIs de concorrência**.
- **Possível evolução do pattern matching**.
- **Melhorias na JVM** (desempenho, segurança).

---

### **Resumo da Evolução do Java**
| **Versão** | **Ano**  | **Destaques** |
|------------|----------|---------------|
| 1.0        | 1996     | Applets, JVM básica |
| 1.2        | 1998     | Collections, Swing |
| 5          | 2004     | Generics, Annotations, Enums |
| 8          | 2014     | Lambdas, Streams, Optional |
| 9          | 2017     | Módulos (Project Jigsaw) |
| 11 (LTS)   | 2018     | HTTP Client, `var` |
| 17 (LTS)   | 2021     | Sealed Classes, ZGC |
| 21 (LTS)   | 2023     | Virtual Threads estáveis |
| 25         | 2025     | Mais concorrência, performance |

---

### **Conclusão**
Java evoluiu de uma linguagem para **applets** nos anos 90 para uma plataforma robusta usada em **cloud, big data e sistemas críticos**. As principais revoluções foram:
1. **Java 5 (Generics, Annotations)**  
2. **Java 8 (Lambdas, Streams)**  
3. **Java 9 (Modularidade)**  
4. **Java 17+ (Concorrência moderna com Virtual Threads)**  

A linguagem continua se modernizando, competindo com Kotlin, Go e Rust, mas mantendo seu ecossistema gigante. 🚀