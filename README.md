# ScreenMatch - Plataforma de Filmes (Projeto de Estudo em Java)

Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais de Programação Orientada a Objetos em Java. 
Ele simula de maneira simples uma interface de uma plataforma de filmes/séries, como uma "mini Netflix".

> ⚠️ Projeto de estudo, ainda em desenvolvimento e com estrutura básica/crua.

---

## Objetivos

- Aplicar os conceitos de **POO** em Java:
  - Herança
  - Encapsulamento
  - Polimorfismo
  - Interfaces
- Utilizar pacotes para **organização de classes**
- Criar um sistema de **avaliação, recomendação e cálculo de tempo**

---

# Estrutura

# Pacote `modelos`

- **`Titulo`**: classe base para filmes e séries, com nome, ano, duração, etc.
- **`Filme`**: herda de `Titulo` e implementa a interface `Classificavel`
- **`Serie`**: também herda de `Titulo`, mas calcula a duração com base nas temporadas/episódios
- **`Episodio`**: representa um episódio de série e também é classificável

# Pacote `calculos`

- **`CalculadoraDeTempo`**: soma a duração total de filmes e séries
- **`FiltroRecomendacao`**: gera uma recomendação simples com base na classificação
- **`Classificavel`**: interface que define o método `getClassificacao()`

# Classe `Principal`

A classe `Principal.java` realiza testes e simula a execução da plataforma, adicionando filmes, séries e episódios para exibir recomendações e calcular o tempo total.

---

# Exemplo de Uso

```java
Filme meuFilme = new Filme();
meuFilme.setNome("O poderoso chefão");
meuFilme.setAnoDeLancamento(1970);
meuFilme.setDuracaoEmMinutos(180);
meuFilme.avalia(8);
meuFilme.avalia(5);
meuFilme.avalia(10);
System.out.println(meuFilme.pegaMedia());
```

---

# Tecnologias

- Java 17+
- IDEs recomendadas: IntelliJ IDEA, Eclipse, VS Code
- Organização de pacotes seguindo padrão `br.com.grocha.screenmatch`

---

# Estrutura de Pastas

```
src/
└── br/
    └── com/
        └── grocha/
            └── screenmatch/
                ├── modelos/
                │   ├── Filme.java
                │   ├── Serie.java
                │   ├── Episodio.java
                │   └── Titulo.java
                └── calculos/
                    ├── CalculadoraDeTempo.java
                    ├── FiltroRecomendacao.java
                    └── Classificavel.java
Principal.java
```

---
-  [LinkedIn](https://www.linkedin.com/in/gustavo-rocha-9b9682167/)
---

## Observações

- Projeto criado com fins exclusivamente educacionais;
- Aberto a contribuições e sugestões para melhorias;
- Próximos passos podem incluir entrada de dados via terminal, persistência com arquivos ou banco de dados e uma interface gráfica simples.

---
