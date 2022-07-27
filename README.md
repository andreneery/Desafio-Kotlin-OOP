# Desafio-Kotlin-OOP

Exercicios praticados pelo RoadMap de OOP - Kotlin


DESAFIO 1 - ANIMAL: 

Dado as seguinte classes: Human, Snake, Dog, Mammal, Hawk, Whale, Bird, Einstein, Animal. Implemente os métodos e heranças de forma que:

  * Todas as classes tenham um método que retorna se a entidade anda sobre a terra

  * Todas as classes tenham um método que retorna se a entidade nada na água

  * Todas as classes tenham um método que retorna se a entidade voa

  * Todas as classes tenham um método que retorna se a entidade está viva

  * Todas as classes tenham um método que retorna se a entidade bota ovos
  

DESAFIO 2 - Calculo Retangulo (Sem OOP)

Criar uma função que calcule a área de um retângulo.

  Sugere-se utilizar a seguinte assinatura:

  fun calcArea(shape : Map<String, Any>) : Int 

  Em que shape pode ser um mutableMapOf:

  val rectangle = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "Red")

  Criar uma função chamada toString que retorne os atributos de um retângulo. 

  Os atributos são: Width; Height; Color e Area
  
  
  DESAFIO 3 - CALCULO RETANGULO OOP
  
    Refazer o primeiro exercício de Kotlin (exercício do Triangulo), agora criando uma classe Triangulo que contém métodos e atributos de um triangulo
  
  DESAFIO 4 - CAR
  
    
  Implementar uma classe Car, que possui um motor.

  O motor deve ser um dos argumentos na criação do Car.

  O motor pode ser um objeto da classe GasEngine, EletricEngine ou GasolineEngine, que possuem alguns métodos/atributos (Pode criar outras classes e heranças):

    * isEnvironmentalFriendly, que retorna se o motor é prejudicial ao meio ambiente ou não

    * useFlammableFuel, que retorna se o combustível usado é inflamável ou não

    * useFossilFuel, que retorna se o combustível usado é de origem fóssil ou não

  O carro deve ter um método que retorna uma nota de qualidade

    * Se o motor do veículo é prejudicial ao meio ambiente, a nota é C

    * Se o motor do veículo não é prejudicial ao meio ambiente, e usa um combustível fóssil a nota é B

    * Se o motor do veículo não é prejudicial ao meio ambiente, e usa um combustível não fóssil a nota é A

  O carro deve ter um método que retorna se precisa conter um extintor ou não

    * Se o motor do veículo usar combustível inflamável, então precisa

    * Caso contrário, não precisa

  No exercício acima, implemente dois novos motores de forma que eles funcionem com o Vehicle:

    HydrogenEngine que representa um motor a hidrogênio

    FlexEngine que representa um motor que funciona com álcool e com gasolina.

    Na instanciação do motor, deve ser passado se ele vai usar álcool ou gasolina

    Implemente os métodos desse motor de forma que reflitam as características do combustível usado
    
    
DESAFIO 5 - CONTA BANCARIA 

  Crie uma classe Account, que representa uma conta bancária. Essa classe deve:

    Conter a informação de saldo da conta, cujo valor inicial é informado quando se cria uma conta

    Deve-se ter formas de se recuperar o valor do saldo da conta

    Deve possuir um método de depósito de dinheiro, mas só devem ser aceitos depósitos de no máximo R$ 10.000,00 (caso contrário, lança um erro)

    Deve possuir um método de saque de dinheiro, mas durante essa operação o saldo da conta não pode ficar negativo (Caso contrário, lança um erro)

    Deve possuir um método de transferência de dinheiro, que recebe uma outra contaX (Instancia de Account) e o valor que deve ser transferido da conta atual para a contaX

    A transferência deve seguir as regras de depósito e saque acima, inclusive com os casos de valores não aceitos

    Não deve ser possível alterar o saldo da conta sem ser pelos métodos acima



  
  
  
