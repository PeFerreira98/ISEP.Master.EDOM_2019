# EDOM - Project Increment 2

"For this assignment you should produce the following documentation (in the readme.md
file of the folder for this increment):
1- Explain possible modifications made to the grammar that was generated by the
Xtext wizard;
2- Describe and explain the formatting added to the requirements DSL;
3- Describe and explain the unit tests added to the requirements DSL project;
4- Analyze your solution for the last requirement.

If you are not able to solve this requirement with MWE2 workflows you should use
simple java code (such as the examples SaveModel and GenerateDot)
Analyze how the workflow solution compares to a more conventional approach (like the
one described in the previous item)"


1- Validação das datas recebidas como STRING e transformadas para EDate.

2- O método de formatação adicionado à DSL desenvolvida encontra-se na classe "MMapDslFormatter", que a insere uma nova linha a cada "{" ou "}" simbolo encontrado dentro dos Topic da root Map.

3- Os testes adicionados visam validar o carregamento do modelo criado no projeto Mindmap, verificando se tanto o Map como os Topics são instanciados corretamente.

4- 