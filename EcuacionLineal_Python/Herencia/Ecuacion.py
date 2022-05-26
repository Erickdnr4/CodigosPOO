from abc import ABC


class Ecuacion(ABC):
    _determinante = float(0)
    _variable = float(0)

    @staticmethod
    def calcularDeterminanate():
        pass

    @staticmethod
    def calcularVariable():
        pass


    def getDeterminante(self):
        return self._determinante

    def getVariable(self):
        return self._variable



class primerIncognita(Ecuacion):
    __coeficienteA = float(0)
    __coeficienteB = float(0)
    __terminoIndependienteC = float(0)
    __coeficienteD = float(0)
    __coeficienteE = float(0)
    __terminoIndependienteF = float(0)

    def __init__(self, coeficienteA, coeficienteB, terminoIndependienteC, coeficienteD, coeficienteE, terminoIndependienteF):
        self.__coeficienteA = coeficienteA
        self.__coeficienteB = coeficienteB
        self.__terminoIndependienteC = terminoIndependienteC
        self.__coeficienteD = coeficienteD
        self.__coeficienteE = coeficienteE
        self.__terminoIndependienteF = terminoIndependienteF
        self.calcularDeterminante()
        self.calcularVariable()

    def calcularDeterminante(self):
        self._determinante = self.__coeficienteA * self.__coeficienteE - self.__coeficienteB * self.__coeficienteD

    def calcularVariable(self):
        self._variable = self.__coeficienteE * self.__terminoIndependienteC - self.__coeficienteB * self.__terminoIndependienteF / self._determinante


class segundaIncognita(Ecuacion):
    __coeficienteA = float(0)
    __coeficienteB = float(0)
    __terminoIndependienteC = float(0)
    __coeficienteD = float(0)
    __coeficienteE = float(0)
    __terminoIndependienteF = float(0)

    def __init__(self, coeficienteA, coeficienteB, terminoIndependienteC, coeficienteD, coeficienteE, terminoIndependienteF):
        self.__coeficienteA = coeficienteA
        self.__coeficienteB = coeficienteB
        self.__terminoIndependienteC = terminoIndependienteC
        self.__coeficienteD = coeficienteD
        self.__coeficienteE = coeficienteE
        self.terminoIndependienteF = terminoIndependienteF
        self.calcularDeterminante()
        self.calcularVariable()

    def calcularDeterminante(self):
        self._determinante = self.__coeficienteA * self.__coeficienteE - self.__coeficienteB * self.__coeficienteD

    def calcularVariable(self):
        self._variable = self.__coeficienteA * self.__terminoIndependienteF - self.__coeficienteD * self.__terminoIndependienteC / self._determinante
