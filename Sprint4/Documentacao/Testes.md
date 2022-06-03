# Avaliação da Aplicação

Nesta Aba você encontra os procedimentos de testes para cada funcionalidade do sistema. <br>
<span style="color:red">Os testes tem como base a documentação da implementação <a href="6-Implementação.md"> Projeto da Solução</a></span>

## Plano de Testes

O plano de testes fundamentou-se na avaliação de cada funcionalidade, a fim de observar seu funcionamento de forma isolada assim como de forma conjunta (na aplicação final).<br>
Os testes foram realizados pelos próprios desenvolvedores e foram modificados de acordo com as necessidades de cada funcionalidade.

## CT-1: Teste do Mapa
Objetivo: Verificar se o mapa está funcionando de forma correta, permitindo que o usuário informe um endereço e que consiga interagir com o mapa diretamente da página da aplicação.
* Desenvolvedor Responsável: Ricardo Henrique Guedes Furiati
* Teste pode ser realizado em: https://rickfuriati.github.io/Collegare/index.html

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Botão de busca funcional | Clicar no botão azul marinho no canto superior do mapa  | Expansão da caixa de busca que permite inserir o endereço desejado |
| #2 | Interatividade do mapa | -Segurar o botão esquerdo do mouse para movimentar o mapa. Segurar a tecla “ctrl” e dar zoom-in ou zoom-out para mostrar mais ou menos detalhes do mapa| Expansão da caixa de busca que permite inserir o endereço desejado| Movimento do mapa de acordo com a interação do usuário (mudança de localização, variação de zoom, tela cheia) |
| #3 | “Autocomplete” da busca | Inserir o endereço desejado na barra de busca | Sugestões de endereço aparecerão abaixo da barra de busca como forma de lista|
| #4 | Exibição do endereço desejado | Clicar na sugestão do endereço desejado (ou apertar “enter” ao terminar de digitar o endereço)  | Exibição do local desejado no mapa |

## CT-2: Teste do Cadastro de Serviços

Objetivo: Testar o funcionamento do cadastro do serviços no sistema.
* Desenvolvedor Responsável: Victor Lopes Azevedo Araujo
* Teste pode ser realizado em: https://vlopinhos.github.io/Cadastro-Collegare/

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Informações Obrigatórias | Deixar de preencher algum campo do formulário  | Caso o campo tenha sido preenchido sua cor fica verde e caso contrário fica vermelha |
| #2 | Tipo de dados no campo "telefone" | Preencher o campo "telefone" com qualquer tipo de dados (caracteres, numeros, letras, símbolos)  | Somente números e símbolos serão aceitos |
| #3 | Espaços em branco no campo "email" | Preencher o campo "email" texto e espaços em branco | Espaços em branco não serão aceitos |
| #4 | Finalização de cadastro | clicar em "enviar"  | Alerta informando se o cadastro foi realizado com sucesso (com todas as informações) ou se algum campo ficou em branco (incompleto) |
| #5 | Exibição dos dados do cadastro| Preencher o cadastro e ao finalizar clicar em "mostrar" | Exibição das informações cadastradas |

## CT-3: Teste da Avaliação de Serviços

Objetivo: Testar o funcionamento da página de avaliação dos serviços.
* Desenvolvedor Responsável: Victor Lopes Azevedo Araujo
* Teste pode ser realizado em: https://vlopinhos.github.io/Estrela-Collegare/

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Estrelas funcionais | Selecionar o numero de estrelas desejado | Numero de estrelas correspondente muda de cor e apresenta um "emoji" de acordo com a avaliação |
| #2 | Campo de texto funcional | Clicar no numero de estrelas desejado | Um campo de texto irá aparecer para que o usuário digite sua experiência |
| #3 | Envio completo | Preencher o campo e clicar em "enviar" | Alerta informando se a avaliação foi enviada com sucesso |
| #4 | Edição do formulário | Após enviar o formulário clica em "editar" | Editar a mensagem de avaliação |

## CT-4: Teste do Browser de Serviços

Objetivo: Testar o funcionamento da página de busca de serviços.
* Desenvolvedor Responsável: Bruno Zandona Aguiar
* Teste pode ser realizado em: https://sprint3.bruszan.repl.co/

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Pesquisar por nome ou categoria | Inserir qualquer cadeia de caracteres em qualquer dos dois campos de texto | A cada caractere inserido a tabela atualiza mostrando apenas o nome ou categoria que possui a mesma sequência de caracteres da inserida no campo de texto |
| #2 | Ordenar tabela por distância ou preço mínimo | Clicar no título (primeira linha) da coluna de Distância ou Preço mínimo | Ordenar as linhas da tabela em ordem crescente baseando-se nos valores da coluna Distância ou Preço mínimo (depende no qual o usuário clicou) |
| #3 | LocalStorage vazio |	Acessar tela principal com localStorage vazio | O site irá ser preenchido com dados pré-definidos caso o localStorage esteja vazio |
| #4 | LocalStorage preenchido | Acessar tela principal com localStorage já preenchido | O site irá ser preenchido com os dados pré-definidos mais os definidos pelo login |

## CT-5: Teste da Edição de Perfil

Objetivo: Teste da página de edição de perfil.
* Desenvolvedora Responsável: Luisa Nogueira Campos Silva Souza
* Teste pode ser realizado em: https://perfil.luisanogueira2.repl.co/

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Preenchimento de campos obrigatórios | Deixar de preencher algum dos campos  | Alerta informando qual campo não foi preenchido |
| #2 | Envio do formulário | Preencher os campos e clicar em "Concluir"  | Alerta informando se o formulário foi enviado com sucesso |
| #3 | Troca de senha | Clicar em "alterar senha" no canto superior direito | Redirecionamento para a página de mudança de senha |
| #4 | Senha alterada com sucesso | Clicar em "salvar senha"  | Alerta informando se a senha foi alterada com sucesso |

## CT-6: Teste da aba "Fale Conosco"

Objetivo: Teste da página "fale conosco".
* Desenvolvedora Responsável: Luisa Nogueira Campos Silva Souza
* Teste pode ser realizado em: https://pt1.luisanogueira2.repl.co/

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Login OK | Acessar tela de login, informar um login e senha corretos, confirmar a validação , aguardar o resultado | Após a confirmação de login, o sistema deverá direcionar o usuário para uma página inicial de usuário logado |
| #2 | Problema no Login | Acessar tela de login, informar um login e senha corretos, confirmar a validação , aguardar o resultado | Após a confirmação de login, o sistema deve apresentar uma tela informando que a senha do usuário está incorreta. |
| #3 | Controle de sessão  | Efetuar o login de um usuário cadastrado, acessar a página subsequente, atualizar a página via refresh dobrowser (F5) | A página deve apresentar o nome do usuário logado logo após o processo de login e também após o refresh da página |


## CT-7: Teste do Login e Cadastro do Sistema

Objetivo: Testar a funcionalidade de cadastro e login do sistema.
* Desenvolvedora Responsável: Lucas Maia Rocha
* Teste pode ser realizado em: https://trabalho-tiaw.lucasmaia14.repl.co/login.html

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Tipos de dados nos campos | Preencher os campos de email e numero com caracteres especiais | Serão aceitos somente caracteres e caracteres especiais (e numeros no caso do telefone |
| #2 | Usuário ou senha incorretos | Preencher os campos com usuário e senha não cadastrados  | Alerta informando que o usuário ou senha estão incorretos ou o usuário não consta no banco de dados |
| #3 | Tela de cadastro | Clicar em "cadastre-se" no canto inferior esquerdo | Redirecionamento para a página de cadastro|
| #4 | Senhas informadas não conferem | Informar duas senhas diferentes nos campos referentes a senha e confirmação de senha | Alerta informando que as senha não coincidem |
| #5 | Acesso dos administradores | Preencher o login com "admin" e a senha como "123" | Redirecionamento para a página de administração que contém os dados exemplo já cadastrados|

## CT-8: Teste do Calendário

Objetivo: Testar o funcionamento da página de calendário.
* Desenvolvedora Responsável: Lucas Maia Rocha
* Teste pode ser realizado em: https://calendario-collegare.lucasmaia14.repl.co/

| Número | Cenário | Ações | Resultado Esperado |
| ------ | --------| ----- | ------------------ |
| #1 | Calendário funcional | Clicar nos botões de "voltar" e "avançar" na esquerda e direita do texto central (respectivamente)  | Avançar ou retornar um mês de acordo com desejado |




