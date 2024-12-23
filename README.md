# Screenmatch

## Descrição
Screenmatch é um aplicativo que consome APIs externas para exibir informações sobre séries e outros conteúdos. Ele utiliza o framework Spring Boot e integra bibliotecas como Jackson para manipulação de dados em JSON.

---

## Funcionalidades

- **Consumo de APIs externas**: Obtém dados de séries e imagens aleatórias de café por meio de endpoints públicos.
- **Conversão de JSON para objetos Java**: Utiliza a biblioteca Jackson para mapear os dados recebidos para classes Java.
- **Arquitetura modular**: Segue princípios de boas práticas com interfaces e classes bem definidas.

---

## Estrutura do Projeto

### Pacotes Principais

- **br.com.alura.screenmatch**: Contém a classe principal que inicia a aplicação.
- **br.com.alura.screenmatch.model**: Define os modelos de dados (ex.: `DadosSerie`).
- **br.com.alura.screenmatch.service**: Contém as classes de serviço para consumo de APIs e conversão de dados (ex.: `ConsumoApi`, `ConverteDados`).

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Jackson (ObjectMapper)**
- **HttpClient**

---

## Pré-requisitos

- JDK 17 ou superior
- Maven 3.8 ou superior

---

## Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/screenmatch.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd screenmatch
   ```
3. Compile e execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```
4. Acompanhe a saída no console para ver os dados obtidos das APIs.

---

## Endpoints Consumidos

- [OMDb API](https://www.omdbapi.com): Obtém informações detalhadas sobre séries e filmes.
  - Exemplo: `https://www.omdbapi.com/?t=gilmore+girls&apikey=SEU_API_KEY`
- [Coffee API](https://coffee.alexflipnote.dev): Retorna imagens aleatórias de café.
  - Exemplo: `https://coffee.alexflipnote.dev/random.json`

---

## Exemplo de Saída no Console

```json
{"Title":"Gilmore Girls","Year":"2000–2007","Rated":"TV-PG","totalSeasons":"7","imdbRating":"8.2","imdbVotes":"155,340"}
DadosSerie[titulo=Gilmore Girls, totalTemporadas=7, avaliacao=8.2, votos=155,340]
{"file":"https://coffee.alexflipnote.dev/7P5cqoxaLCY_coffee.jpg"}
```

---

## Melhorias Futuras

- Adicionar testes unitários para as classes de serviço.
- Implementar um front-end para exibir os dados de forma amigável.
- Melhorar o tratamento de erros durante o consumo das APIs.

---

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
