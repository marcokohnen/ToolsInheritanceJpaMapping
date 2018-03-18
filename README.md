# ToolsInheritanceJpaMapping

Voorbeeld app van mapping entiteiten met inheritance :
Abstract class AbstractEntity om extended classes autometatisch een id mee te geven
Abstract class Tools extended door class Hamer en DrillingMachine
Elke subclass heeft een eigen tabel met eigen id-nummering
1 algemene repository voor de class Tool met gezamenlijke methodes voor de classes Hamer en DrillingMachine
2 "lege" repository die extenden van de algemene repository
