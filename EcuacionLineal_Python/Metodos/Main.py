from Metodos import ecuacionLineal
from Metodos.ecuacionLineal import *

def main():

    #Metodo de clase
    print("Metodo de clase")
    print(EcuacionLineal.calcularDeterminante(2, 8, 1, 4))


    #Metodo de instancia
    print("Metodo de instancia")
    print(EcuacionLineal.calcularVariableX())
    print(EcuacionLineal.calcularVariableY())


if __name__ == '__main__':
    main()