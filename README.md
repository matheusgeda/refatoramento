# Projeto de Refatoramento

#### Disciplina: Projeto de Software

#### Professor: Baldoino Fonseca dos Santos Neto

#### Projeto base: https://github.com/matheusgeda/projeto-oo

#### Smells encontrados:

#### 1: Lazy Class: https://github.com/matheusgeda/refatoramento/blob/master/images/lazyclass.png
A classe tinha muito pouca utilidade.

**Solução:** Essa classe foi excluída e as duas classes que herdavam ela receberam as informações que ela passava.

#### 2: Long Method: https://github.com/matheusgeda/refatoramento/blob/master/images/longmethod1.png
#### https://github.com/matheusgeda/refatoramento/blob/master/images/longmethod2.png
O método **client_register()** da classe Clients e o **worker_register()** da classe Workers estavam excessivamente grandes.

**Solução:** Foram criados novos métodos que fazem uma parte do que o método antigo fazia resultando em 2 métodos muito menores.
