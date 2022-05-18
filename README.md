# Projeto Final - Pizzaria MJV

#### Autor

- [Bruno Mieli](https://github.com/BrunoAMieli)

Este repositório contém o projeto final na MJV, uma API que representa uma maneira de fazer um pedido de pizza.

##### Tecnologias

* Java;
* JPA Hibernate;
* H2;
* Thymeleaf;
* HTML;
* CSS;
* Spring Boot;
* Swagger.

##### Apresentação

1. Cadastro de categorias: cardápio e forma de pagamento;
2. Cadastro de pedido.

##### JSON Cadastros

* Cadastrando a categoria CARDÁPIO

```
{
  "nome": "MUSSARELA",
  "descricao": "Mussarela, orégano e azeitona.",
  "valor": 45.0
},
{
  "nome": "CALABRESA",
  "descricao": "Calabresa, cebola e azeitonas.",
  "valor": 45.0
},
{
  "nome": "MARGUERITA",
  "descricao": "Mussarela, molho de tomate, manjericão, parmesão ralado.",
  "valor": 52.0
}
```

* Cadastrando a categoria FORMA DE PAGAMENTO

```
{
  "nome": "Débito"
},
{
  "nome": "Crédito"
},
{
  "nome": "Dinheiro"
}
```

* Cadastrando o PEDIDO DE PIZZA

```
{
  "nomeCompleto": "Teste MJV",
  "telefone": "(11) 91234-5678",
  "rua": "Av.Paulista",
  "numero": "1000",
  "cep": "03113-100",
  "cardapio": {
    "codigo": 2
  },
  "pagamento": {
    "codigo": 3
  },
  "observacao": "Sem cebola, por favor."
}
```

##### FRONT-END

* Tela da PÁGINA INICIAL
Endereço da página: http://localhost:8080/pedido/home

<img width="1440" alt="home" src="https://user-images.githubusercontent.com/86811968/168950278-bbf0364a-efc7-4018-bfd1-c9064f976460.png">

<img width="1440" alt="home 2" src="https://user-images.githubusercontent.com/86811968/168950399-719f2b1f-86f6-40d9-bb33-c8697b8f21eb.png">

<img width="1440" alt="home 3" src="https://user-images.githubusercontent.com/86811968/168950291-239c281f-fffa-43dc-84b4-df196b5649da.png">

* Tela de CARDÁPIO
Endereço da página: http://localhost:8080/pedido/cardapio

<img width="1440" alt="Cardapio" src="https://user-images.githubusercontent.com/86811968/168950326-8190c374-1f45-4279-bc8c-e0d6e5f30855.png">

* Tela de cadastro de PEDIDO DE PIZZA
Endereço da página: http://localhost:8080/pedido/cadastrar

<img width="1440" alt="Fazer Pedido" src="https://user-images.githubusercontent.com/86811968/168950362-0382d001-5c7c-4791-bd63-ee949e13e93f.png">

* Tela de listagem de PEDIDOS
Endereço da página: http://localhost:8080/pedido/listar

<img width="1440" alt="Pedidos" src="https://user-images.githubusercontent.com/86811968/168950383-b7661394-2496-409d-8c17-6b264b0d9b71.png">

##### Insert's no banco de dados
INSERT INTO CARDAPIO_PIZZA (CODIGO, DESCRICAO, NOME, VALOR) VALUES 
(1, 'Catupiry, azeitonas e orégano.', 'CATUPIRY', 50.0),
(2, 'Mussarela, catupiry, provolone, parmesão ralado, gorgonzola.', 'CINCO QUEIJOS', 55.0),
(3, 'Mussarela ou catupiry, rodelas de tomate, parmesão ralado, gorgonzola.', 'DO PAPA', 52.0),
(4, 'Mussarela e catupiry.', 'DOIS QUEIJOS', 50.0),
(5, 'Gorgonzola, azeitonas e orégano.', 'GORGONZOLA', 50.0),
(6, 'Mussarela salpicada com alho.', 'GRATINDADA', 50.0),
(7, 'Mussarela, molho de tomate, manjericão, parmesão ralado.', 'MARGUERITA', 52.0),
(8, 'Mussarela, orégano e azeitona.', 'MUSSARELA', 45.0),
(9, 'Mussarela com parmesão ralado e rodelas de tomate.', 'NAPOLITANA', 50.0),
(10, 'Fatias de provolone e azeitonas.', 'PROVOLONE', 50.0),
(11, 'Mussarela, catupiry, provolone, parmesão ralado.', 'QUATRO QUEIJOS', 55.0),
(12, 'Aliche importado com tomate e parmesão ralado.', 'ALICHE', 48.0),
(13, 'Atum, cebola e azeitona.', 'ATUM', 48.0),
(14, 'Atum coberto com catupiry.', 'ATUM C/ CATUPIRY', 50.0),
(15, 'Atum coberto com mussarela.', 'ATUM C/ MUSSARELA', 50.0),
(16, 'Camarão, atum, ovos, azeitonas e mussarela.', 'CHOPPIZZA', 50.0),
(17, 'Mussarela, palmito, atum, ervilhas, ovos, cebola, azeitonas.', 'PERUANA', 48.0),
(18, 'Mussarela, aliche, rodelas de tomate e azeitonas.', 'ROMANA', 48.0),
(19, 'Presunto fatiado, azeitonas pretas, mussarela.', 'À MODA DA CASA', 52.0),
(20, 'Presunto fatiado, ovos, azeitonas pretas, mussarela.', 'À MODA ANTIGA', 52.0),
(21, 'Mussarela, calabresa, bacon e cebola.', 'ALEMÃ', 48.0),
(22, 'Calabresa moída, rodelas de tomate, parmesão ralado, cebola, azeitonas e pimenta.', 'BAIANA', 48.0),
(23, 'Bacon, rodelas de tomate, cebola e azeitonas.', 'BACON', 48.0),
(24, 'Bacon fatiado coberta com catupiry.', 'BACON C/ CATUPIRY', 50.0),
(25, 'Bacon fatiado coberta com mussarela.', 'BACON C/ MUSSARELA', 50.0),
(26, 'Calabresa, cebola e azeitonas.', 'CALABRESA', 45.0),
(27, 'Calabresa, fatias de bacon e cebola.', 'CALABRESA C/ BACON', 50.0),
(28, 'Calabresa, coberta com catupiry.', 'CALABRESA C/ CATUPIRY', 50.0),
(29, 'Calabresa, coberta com mussarela.', 'CALABRESA C/ MUSSARELA', 50.0),
(30, 'Presunto picado, champignon, mussarela e bacon.', 'DA HORA', 48.0),
(31, 'Calabresa picada, cebola e azeitonas.', 'ESPANHOLA', 52.0),
(32, 'Presunto picado, ovos, catupiry, coberta com mussarela.', 'FRANCESA', 52.0),
(33, 'Presunto fatiado, azeitonas verdes picadas coberta com mussarela ou catupiry.', 'FORNEIRO', 52.0),
(34, 'Lombo, champignon, azeitonas e mussarela.', 'ITALIANA', 52.0),
(35, 'Lombo Canadense, cebola e azeitonas.', 'LOMBINHO', 50.0),
(36, 'Lombo defumado coberto com catupiry.', 'LOMBO C/ CATUPIRY', 52.0),
(37, 'Mussarela, palmito, atum, ervilhas, ovos, cebola, azeitonas.', 'PAULISTA', 50.0),
(38, 'Presunto, catupiry, ervilhas, champignon, ovos, mussarela.', 'PIZZAIOLO', 52.0),
(39, 'Mussarela, presunto, ovos, cebola, azeitonas.', 'PORTUGUESA', 52.0),
(40, 'Calabresa moída coberta com mussarela ou catupiry.', 'TOSCANA', 50.0),
(41, 'Frango desfiado temperado com catupiry e azeitonas.', 'FRANGO C/ CATUPIRY', 52.0),
(42, 'Frango desfiado com milho com cobertura de catupiry ou mussarela.', 'FRANGO', 48.0),
(43, 'Alho e óleo, parmesão ralado e azeitonas.', 'ALHO E ÓLEO', 50.0),
(44, 'Mussarela, palmito, bacon, ovos e cebola.', 'AMERICANA', 52.0),
(45, 'Champignon e cebola com mussarela ou calabresa', 'CHAMPIGNON', 50.0),
(46, 'Champignon, alcaparra, catupiry e provolone.', 'CHAMPIGNON C/ ALCAPARRAS', 52.0),
(47, 'Escarola, mussarela e aliche.', 'ESCAROLA', 48.0),
(48, 'Escarola, palmito, ervilhas, milho, mussarela ou catupiry.', 'JARDINEIRA', 50.0),
(49, 'Milho verde, catupiry ou mussarela.', 'MILHO VERDE', 52.0),
(50, 'Palmito, azeitonas pretas e mussarela.', 'PALMITO', 50.0),
(51, 'Mussarela, Champignon e bacon.', 'SICILIANA', 52.0),
(52, 'Escarola, alho, champignon, milho e mussarela.', 'VEGETARIANA', 50.0);

INSERT INTO FORMA_PAGAMENTO (CODIGO, NOME) VALUES  
(1, 'Crédito'),
(2, 'Débito'),
(3, 'Dinheiro');

##### Select's no banco de dados
SELECT * FROM PEDIDO;
SELECT * FROM FORMA_PAGAMENTO;
SELECT * FROM CARDAPIO_PIZZA;
