class EcuacionLineal:
    __coeficienteA = float(0)
    __coeficienteB = float(0)
    __terminoIndependienteC = float(0)
    __coeficienteD = float(0)
    __coeficienteE = float(0)
    __terminoIndependienteF = float(0)
    __determinante = float(0)
    __variableX = float(0)
    __variableY = float(0)


    #Metodo constructor
    def __init__(self, coeficienteA, coeficienteB, terminoIndependienteC, coeficienteD, coeficienteE, terminoIndependienteF):
        self.__coeficienteA = coeficienteA
        self.__coeficienteB = coeficienteB
        self.__terminoIndependienteC = terminoIndependienteC
        self.__coeficienteD = coeficienteD
        self.__coeficienteE = coeficienteE
        self.__terminoIndependienteF = terminoIndependienteF
        self.calcularDeterminante()
        self.calcularVariableX()
        self.calcularVariableY()

    #Metodo destructor
    def __del__(self):
        self.calcularDeterminante()
        self.calcularVariableX()
        self.calcularVariableY()

    # Sobrecarga de operadores
    def __str__(self):
        return "la variable X de la escuacion es" + self.__VariableX + "mientras que la variable Y es" + self.__variableY


    #Metodo de clase
    @classmethod
    def calcularDeterminante(cls, coeficienteA,  coeficienteE, coeficienteB, coeficienteD):
        determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD
        return determinante

    # Metodo de instancia
    def calcularVariableX(self):
        self.__VariableX = self.__coeficienteE * self.__terminoIndependienteC - self.__coeficienteB * self.__terminoIndependienteF / self.__determinante
    def get_variableX(self):
        return self.__variableX

    def calcularVariableY(self):
        self.__variableY = self.__coeficienteA * self.__terminoIndependienteF - self.__coeficienteD * self.__terminoIndependienteC / self.__determinante
    def get_variableY(self):
       return self.__variableY




