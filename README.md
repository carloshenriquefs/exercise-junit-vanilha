## Exercício: JUnit Vanilha

* Exercício de testes unitários para validar classe Financing;

##

![junit drawio](https://github.com/carloshenriquefs/exercise-junit-vanilha/assets/54969405/90211585-9b53-4859-9a77-ff0f66285a03)

## - totalAmont: 
Valor Total de dinheiro financiado; <br /> 

## - income: 
Renda mensal do cliente que está financiando; <br /> 

## - months:
Número de meses do financiamento; <br /> 

##

### :pushpin: Exemplo 1: 

    Este exemplo é INVÁLIDO porque com esses dados a entrada seria 20000 e a prestação seria 4000. 
    Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

```
{
  totalAmount: 100000,
  income: 2000,
  months: 20
}
```

##

### :pushpin: Exemplo 2: 

    Já este exemplo é VÁLIDO porque a entrada seria 2000 e a prestação seria 1000.
    Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.

```
{
  totalAmount: 100000,
  income: 2000,
  months: 80
}
```

##

## :clipboard: - Testes:

* Serão implementados os seguintes testes para validar esta classe:

##

### - Construtor:  <br />

    Deve criar o objeto com os dados corretos quando os dados forem válidos  
    Deve lançar IllegalArgumentException quando os dados não forem válidos

### - setTotalAmount:  <br />

    Deve atualizar o valor quando os dados forem válidos  
    Deve lançar IllegalArgumentException quando os dados não forem válidos

### - setIncome:  <br />

    Deve atualizar o valor quando os dados forem válidos  
    Deve lançar IllegalArgumentException quando os dados não forem válidos

### - setMonths:  <br />

    Deve atualizar o valor quando os dados forem válidos  
    Deve lançar IllegalArgumentException quando os dados não forem válidos

### - entry:  <br />

    Deve calcular corretamente o valor da entrada

### - quota:  <br />

    Deve calcular corretamente o valor da prestação


