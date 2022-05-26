from Herencia.Ecuacion import primerIncognita, segundaIncognita


def main():
    variableX = primerIncognita(2, 1, 3, 4, 8, 6)
    print("Determinante:")
    print(variableX.getDeterminante())
    print("VariableX:")
    print(variableX.getVariable())
    print("")

    variableY = segundaIncognita(2, 1, 3, 4, 8, 6)
    print("Determinante:")
    print(variableY.getDeterminante())
    print("VariableY:")
    print(variableY.getVariable())


if __name__ == "__main__":
    main()
