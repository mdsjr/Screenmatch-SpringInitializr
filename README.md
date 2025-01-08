# Screenmatch

## Descrição
Screenmatch é um aplicativo que consome APIs externas para exibir informações sobre séries e outros conteúdos. Ele utiliza o framework Spring Boot e integra bibliotecas como Jackson para manipulação de dados em JSON.

Conectar dados disponibilizados pelo back-end à uma aplicação front-end, disponibilizada nesse [link](https://github.com/mdsjr/java-web-front).

---

## Funcionalidades

- **Back-end com Spring Boot**:
    - Consumo de APIs externas.
    - Conversão de JSON para objetos Java com Jackson.
    - Suporte a CORS para integração com o front-end.
- **Front-end interativo**:
    - Interface web que consome dados do back-end.
    - Renderização de informações de séries e conteúdos de forma amigável.

---

## Estrutura do Projeto

### Back-end

- **Pacotes Principais**:
    - **br.com.alura.screenmatch**: Classe principal que inicia a aplicação.
    - **br.com.alura.screenmatch.model**: Modelos de dados (ex.: `DadosSerie`).
    - **br.com.alura.screenmatch.service**: Classes de serviço para consumo de APIs (ex.: `ConsumoApi`, `ConverteDados`).
    - **br.com.alura.screenmatch.config**: Configurações do projeto, como CORS.

### Front-end

- **Tecnologias Utilizadas**:
    - HTML5, CSS3 e JavaScript.
    - Integração com o back-end via requisições HTTP (fetch API).
    - Extensão *Live Server* para execução local.

---

### Pacotes Principais

- **br.com.alura.screenmatch**: Contém a classe principal que inicia a aplicação.
- **br.com.alura.screenmatch.model**: Define os modelos de dados (ex.: `DadosSerie`).
- **br.com.alura.screenmatch.service**: Contém as classes de serviço para consumo de APIs e conversão de dados (ex.: `ConsumoApi`, `ConverteDados`).

---

## Tecnologias Utilizadas

- **Back-end**:
    - Java 17
    - Spring Boot
    - Jackson (ObjectMapper)
    - HttpClient
- **Front-end**:
    - HTML5
    - CSS3
    - JavaScript
    - Live Server (VS Code)

---

## Pré-requisitos

- **Back-end**:
    - JDK 17 ou superior
    - Maven 3.8 ou superior
- **Front-end**:
    - VS Code com a extensão *Live Server*

---

## Como Executar o Projeto

### Back-end

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

### Front-end

1. Clone o repositório front-end:
   ```bash
git clone https://github.com/mdsjr/screenmatch-frontend.git

2. Abra o diretório do projeto no VS Code.

3. Clique com o botão direito no arquivo `index.html` e selecione *Open with Live Server*.

---
## Configuração de CORS
O back-end foi configurado para permitir o acesso do front-end hospedado localmente. 
A configuração está no arquivo CorsConfiguration.java:

---
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5501")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
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
