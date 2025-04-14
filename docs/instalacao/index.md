---
title: "🛠️ Instalação no Windows"
---

Siga este guia para configurar o ambiente de desenvolvimento Java no Windows.

---

## 📥 **Instalação do Java (JDK)**

### **Passo 1: Baixar o JDK**
- Acesse [Adoptium Temurin (JDK 21 LTS)](https://adoptium.net/) ou [Oracle JDK](https://www.oracle.com/java/technologies/downloads/).
- Selecione o instalador para Windows (`.msi`).

### **Passo 2: Executar o Instalador**
- Execute o arquivo `.msi` e siga as instruções (use o caminho padrão: `C:\Program Files\Java\jdk-21`).

### **Passo 3: Configurar Variáveis de Ambiente**
1. **JAVA_HOME**:
   - Painel de Controle → Sistema → Configurações avançadas → Variáveis de Ambiente.
   - Nova variável do sistema:
     ```
     Nome: JAVA_HOME
     Valor: C:\Program Files\Java\jdk-21
     ```
2. **Adicionar ao PATH**:
   - Edite a variável `Path` e adicione:
     ```
     %JAVA_HOME%\bin
     ```

### **Passo 4: Verificar Instalação**
```cmd
java -version
javac -version
```
Saída esperada:
```
java version "21.0.2" 2024-01-16 LTS
javac 21.0.2
```

---

## 🔌 **Instalação de IDEs**

Escolha uma das IDEs abaixo:

=== "IntelliJ IDEA (Recomendada)"
    ### **Passo 1: Download**
    - Baixe a [Community Edition](https://www.jetbrains.com/idea/download/).

    ### **Passo 2: Instalação**
    - Execute o instalador e marque:
      - `Add launchers dir to the PATH`
      - `.java` nas associações de arquivo.

    ### **Passo 3: Configurar JDK**
    1. **Novo Projeto** → `New Project`.
    2. Em `JDK`, clique em `Add JDK` e selecione `C:\Program Files\Java\jdk-21`.

    ```java
    // Teste com um Hello World:
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello IntelliJ!");
        }
    }
    ```

=== "Eclipse"
    ### **Passo 1: Download**
    - Baixe [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/).

    ### **Passo 2: Instalação**
    - Extraia o arquivo `.zip` em uma pasta (ex: `C:\eclipse`).
    - Execute `eclipse.exe`.

    ### **Passo 3: Configurar JDK**
    1. **Window → Preferences → Java → Installed JREs**.
    2. Clique em `Add` → `Standard VM` → Selecione o diretório do JDK 21.

=== "VS Code"
    ### **Passo 1: Instalar VS Code**
    - Baixe do [site oficial](https://code.visualstudio.com/).

    ### **Passo 2: Extensão Java**
    - Instale a extensão [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).

    ### **Passo 3: Configurar JDK**
    1. Aperte `Ctrl + Shift + P` → `Java: Configure Java Runtime`.
    2. Selecione o JDK 21 na lista.

    ```java
    // Crie um arquivo `Main.java` e execute com F5:
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello VS Code!");
        }
    }
    ```

---

## 🚨 **Solução de Problemas Comuns**

- **`java` não é reconhecido**:  
  - Verifique se `JAVA_HOME` e `Path` estão corretos. Reinicie o prompt após alterações.

- **Erros no Eclipse**:  
  - Use `Window → Preferences → Java → Compiler` para garantir o compliance level `21`.

