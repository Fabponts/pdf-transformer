#  Pdf Converter
![Status](https://img.shields.io/badge/Status-Em%20Andamento-orange)
![Java](https://img.shields.io/badge/Java-17-red?logo=openjdk)
![CSS](https://img.shields.io/badge/CSS-3-blue?logo=css3&logoColor=white)

Este projeto tem como objetivo o desenvolvimento de uma aplicação desktop em Java, utilizando JavaFX, voltada para a conversão e manipulação de arquivos nos formatos PNG, JPEG e PDF. A aplicação permite ao usuário realizar conversões entre diferentes tipos de arquivos de forma simples, rápida e intuitiva, por meio de uma interface gráfica amigável.

---

## 📌 Funcionalidades

### Conversão de Arquivos
- Conversão entre os formatos:
  - **PNG → PDF** (Em breve)
  - **JPEG → PDF**
  - **PDF → PNG** (Em breve)
  - **PDF → JPEG**
- Suporte a arquivos individuais.
- Preservação da qualidade dos arquivos convertidos.

### Interface Gráfica (JavaFX)
- Interface intuitiva e amigável para o usuário.
- Seleção de arquivos via **FileChooser**. (Em breve)
- Exibição de mensagens de sucesso e erro durante o processo de conversão. 
- Separação entre camada visual e lógica de negócio.

### Processamento e Validações
- Validação de formatos suportados antes da conversão.
- Tratamento de exceções para:
- Arquivos inválidos ou corrompidos.
- Erros de leitura e escrita.
- Organização do fluxo de conversão para evitar falhas durante o processamento.

---

## 🛠️ Tecnologias utilizadas
- **Java 17+**
- **JavaFX**
- Manipulação de arquivos (`java.io`, `java.nio`)
- Programação Orientada a Objetos (POO)
- Tratamento de exceções

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/pdf-converter-javafx.git

   ````
---
2. Compile o projeto:
 ```bash
  javac --module-path /caminho/javafx/lib --add-modules javafx.controls,javafx.fxml src/org/example/*.java
   ````
---
3. Execute a aplicação:
    ```bash
   java --module-path /caminho/javafx/lib --add-modules javafx.controls,javafx.fxml org.example.Main
   ````
---
   ## Estrutura do projeto
````
   src/
 └── org/example/
      ├── controller/
      │    └── ConverterController.java
      ├── service/
      │    └── ConverterService.java
      ├── view/
      │    └── MainView.fxml
      └── Main.java
````
---

## 📖 Licença
Este projeto é de caráter educacional e pode ser utilizado livremente para fins de estudo, aprendizado e demonstração de aplicações desktop em Java.

## 👨‍💻 Autor
Desenvolvido por Fabrício Pontes como projeto de aprendizado em Java, JavaFX e manipulação de arquivos, com foco em boas práticas, organização de código e separação de responsabilidades.
