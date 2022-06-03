# Projeto da Solução

## Tecnologias Utilizadas
As tecnologias utilizadas para implementação do projeto foram:
  * Front-End: Arquivos HTML, CSS e JavaScript que em conjunto formam a página WEB.
    * Para o desenvolvimento da página HTML foi utilizado o framework "bootstrap" que permite maior facilidade no desenvolvimento da responsividade.
    * A biblioteca "Font-Awesome" foi utilizada para incluir todos os ícones da aplicação de forma integrada
    * Os ambientes de desenvolvimento escolhidos foram o "Visual Studio Code" e a ferramenta "replit" de acordo com a preferência do desenvolvedor.
    * Os artefatos específicos foram publicados na WEB por meio das  plataformas do "Github Pages" e "replit".
    
      > A plataforma do GitHub pages foi escolhida para hospedagem da aplicação final por possuir integração direta com o repositório utilizado ao longo do desenvolvimento  
      
  * Back-End: Baseado em "Java Aplication"
    * Ambiente de desenvolvimento "Eclipe"
      > A IDE Eclipse foi escolhida por permitir a manipulação das diversas partes do back-end de forma integrada. 
    * Maven e Spark Framework 
  * Banco de Dados: Implementação local e em nuvem
    * PostgreSQL: A implementação local do banco de dados foi feita utilizando o postgreSQL que juntamente com o PHPAdmin permitiu a análise de casos de teste para as diferentes entidades utilizadas no desenvolvimento do projeto (Usuários e Serviços)
    * Azure: O banco de dados da aplicação foi implementado em núvem utilizando a plataforma Microsofr Azure. 
      
  * API'S: Foram utilizadas duas API's no desenvolvimento da funcionalidade do mapa na aplicação
    * Google Maps Api: API do google maps que permite interagir com o mapa diretamente da página WEB
    * Places API: Extensão do API do google maps que permite a sugestão e sugestão de lugares de acordo com o endereço fornecido pelo usuário
 

## Arquitetura da solução

# Funcionalidades da Aplicação
  Nesta sessão encontra-se a descrição das funcionalidades presentes na aplicação 
  
  * As funcionalidades apresentam-se com imagens de suas respectivas telas, estruturas de dados, desenvolvedor responsável e link disponível na WEB

## Mapa Integrado
A funcionalidade de Mapa permite que o usuário busque o endereço desejado
  * Ao digitar o endereço uma sugestão surge como lista embaixo da barra de busca 
  * API's Utilizadas: Google maps API e Places API
  
Desenvolvedor responsável: Ricardo Henrique Guedes Furiati

  > Documentação disponível em: https://developers.google.com/maps/documentation <br>
  > Funcionalidade disponível em: https://rickfuriati.github.io/Collegare/index.html <br>


<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/015e27c3d7d2dc35a116b15d88d11972d43658b9/Documentacao/images/Funcionalidades/Mapa.png" width="400">

## Cadastro de Serviços

Página do cadastro do site com dois botões, um para salvar o novo cadastro do
localstorage e outro para mostrar todos os cadastros já salvos no local storage. O botão de
salvar já mostra automaticamente o que estava no localstorage sem a necessidade de
apertar o botão de mostrar, além de uma função para mostrar que os espaços não podem
ficar em branco sinalizando em vermelho as caixas de texto.

Desenvolvedor Responsável: Victor Lopes Azevedo Araujo

> Funcionalidade disponível em: https://vlopinhos.github.io/Cadastro-Collegare/

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/aba9d75c159752e1cc4169613ba271a92c80b0ec/Documentacao/images/Funcionalidades/Cadastro.png" width="400">

### Estrutura de Dados:
``` javascript
function incluirCadastro() {
 
 let objDados = leDados();
 
 let strNome = document.getElementById("inputNome").value;
 let strEmpresa = document.getElementById("inputEmpresa").value;
 let strCategoria = document.getElementById("inputCategoria").value;
 let strEndereco = document.getElementById("inputEndereco").value;
 let strTelefone = document.getElementById("inputTelefone").value;
 let strEmail = document.getElementById("inputEmail").value;
 let strDescricao = document.getElementById("inputDescricao").value;
 
 let novoCadastro = {
 
   nome: strNome,
   empresa: strEmpresa,
   categoria: strCategoria,
   endereco: strEndereco,
   telefone: strTelefone,
   email: strEmail,
   descricao: strDescricao
 };
 
 objDados.cadastros.push(novoCadastro);
 
 salvaDados(objDados);
 
 imprimeDados();
 
}

```

## Avaliação dos Prestadores de Serviços

Página de avaliação do site com a funcionalidade de armazenar no local
storage o valor das estrelas e uma caixa de texto para avaliações mais detalhadas de cada
usuário. Após a avaliação um alerta é ativado mostrando que a opinião foi salva com
sucesso e um novo botão para editar as informações salvas, caso queira reavaliar o que foi
enviado.Ao clicar na quinta estrela uma animação é ativada onde todas as estrelas
começam a brilhar.

Desenvolvedor Responsável: Victor Lopes Azevedo Araujo

> Funcionalidade disponível em: https://vlopinhos.github.io/Estrela-Collegare/

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/93f2e538dd08d035ded570d44ea9e03264848c7e/Documentacao/images/Funcionalidades/Avalia%C3%A7%C3%A3o.png" width="400">

### Estrutura de Dados:
``` javascript
function () {
   var descricao = document.getElementById("descricao").value;
   localStorage.setItem("descricao", descricao);
 
   //5 estrelas
   if (document.getElementById("rate-5").checked == true) {
     localStorage.setItem("five", true);
     localStorage.setItem("four", false);
     localStorage.setItem("three", false);
     localStorage.setItem("two", false);
     localStorage.setItem("one", false);
   }
 
   //4 estrelas
   if (document.getElementById("rate-4").checked == true) {
     localStorage.setItem("five", false);
     localStorage.setItem("four", true);
     localStorage.setItem("three", false);
     localStorage.setItem("two", false);
     localStorage.setItem("one", false);
   }
 
   //3 estrelas
   if (document.getElementById("rate-3").checked == true) {
     localStorage.setItem("five", false);
     localStorage.setItem("four", false);
     localStorage.setItem("three", true);
     localStorage.setItem("two", false);
     localStorage.setItem("one", false);
   }
 
   //2 estrelas
   if (document.getElementById("rate-2").checked == true) {
     localStorage.setItem("five", false);
     localStorage.setItem("four", false);
     localStorage.setItem("three", false);
     localStorage.setItem("two", true);
     localStorage.setItem("one", false);
   }
 
   //1 estrela
   if (document.getElementById("rate-1").checked == true) {
     localStorage.setItem("five", false);
     localStorage.setItem("four", false);
     localStorage.setItem("three", false);
     localStorage.setItem("two", false);
     localStorage.setItem("one", true);
   }
 
   alert("Salvo!");
 },
 false
);
```


## Browser de Serviços
Apresenta as informações de cadastradas do prestador de serviço no localStorage

Desenvolvedor Responsável: Bruno Zandona Aguiar

> Funcionalidade disponível em: https://sprint3.bruszan.repl.co/

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/b1a361709b791dee92492e5db005b946bbff2919/Documentacao/images/Funcionalidades/Browser.png" width="800">

### Estrutura de Dados:
``` javascript
// Dados de usuários para serem utilizados como carga inicial
const dadosIniciais = {
  usuarios: [
    {
      id: generateUUID(),
      nome: "Bruno Zandona",
      empresa: "PUC Minas",
      categoria: "Administrador do Sistema",
      endereco: "Padre Eustáquio",
      telefone: "31 99336-8839",
      email: "bruzan57@gmail.com",
      descricao: "Trabalho bom e bem feito",
      distancia: "2000",
      precomin: "10",
    },
    {
        id: generateUUID(),
        nome: "Francisca",
        empresa: "Fran Limpezas Corporativas",
        categoria: "Limpeza",
        endereco: "Rua Monte Negro, 123",
        telefone: "31 99121-3412",
        email: "fran@outlook.com",
        descricao: "Limpo com excelência a sua empresa",
        distancia: "100 metros",
        precomin: "40",
    },
```


## Edição de Perfil

Funcionalidade que permite ao usuário do sistema editar informações básicas e preferências a serem utilizadas em outras partes do sistema.

Desenvolvedor Responsável: Luisa Nogueira Campos Silva Souza

> Funcionalidade disponível em: https://perfil.luisanogueira2.repl.co/

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/cf375a976ebb087890738c809c96d964d082c504/Documentacao/images/Funcionalidades/Edi%C3%A7%C3%A3ode%20Perfil.png" width="800">

### Estrutura de Dados:
``` javascript
let user = document.querySelector('#user');
let labelUser = document.querySelector('#labelUser');
 
let name = document.querySelector('#name');
let labelName = document.querySelector('#labelName');
 
let lastName = document.querySelector('#lastName');
let labelLastName = document.querySelector('#labelLastName');
 
let email = document.querySelector('#email');
let labelEmail = document.querySelector('#labelEmail');
 
let telephone = document.querySelector('#telephone');
let labelTelephone = document.querySelector('#labelTelephone');
 
let address= document.querySelector('#address');
let labelAddress= document.querySelector('#labelAddress');
 
let city = document.querySelector('#city');
let labelCity = document.querySelector('#labelCity');
 
let state = document.querySelector('#state');
let labelState= document.querySelector('#labelState');
 
document.querySelector("#user").value = localStorage.getItem("usuario");
document.querySelector("#name").value = localStorage.getItem("nome");
document.querySelector("#lastName").value = localStorage.getItem("sobrenome");
document.querySelector("#email").value = localStorage.getItem("email");
document.querySelector("#telephone").value = localStorage.getItem("telefone");
document.querySelector("#address").value = localStorage.getItem("endereço");
document.querySelector("#city").value = localStorage.getItem("cidade");
document.querySelector("#state").value = localStorage.getItem("estado");
```

## Fale Conosco

Página destinada ao envio de mensagens dos clientes ao suporte do site, para esclarecer dúvidas ou até mesmo solicitar melhorias dentro do
site.

Desenvolvedor Responsável: Luisa Nogueira Campos Silva Souza

> Funcionalidade disponível em: https://pt1.luisanogueira2.repl.co/

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/0b7069c4145e51acb36b4eae497637af8a0b0951/Documentacao/images/Funcionalidades/fale%20conosco%20.png" width="800">

### Estrutura de Dados:
``` javascript
let nome = document.querySelector('#nome');
let labelNome = document.querySelector('#labelNome');
let email = document.querySelector('#email');
let labelEmail = document.querySelector('#labelEmail');
let mensagem = document.querySelector('#mensagem');
let labelMensagem = document.querySelector('#labelMensagem');
```

## Login e Cadastro do Sistema

O painel de login está configurado para receber alguns testes como por exemplo, verificar se o autocomplete do usuário está desativado, pois
assim garante uma melhor navegação do usuário em nossa página, teste o login com o usuário sendo “GabrielJoao” e a senha “1234324234”, assim você
terá acesso ao painel com os demais usuários logados. Ao preencher um novo usuário, teste as seguintes abas: Nome Completo, Usuário e E-mail, pois
alguns caracteres como “%%&$#*()-¨,.'+-=!@0123456789” estarão bloqueados dependendo de onde você estiver preenchendo.


Desenvolvedor Responsável: Lucas Maia Rocha

> Funcionalidade disponível em: https://loginapp-2.lucasmaia14.repl.co/login.html

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/d9771402bdbeb36e2212264531cc0f8941703418/Documentacao/images/Funcionalidades/Login.png" width="600">

### Estrutura de Dados:
``` javascript
const dadosIniciais = {
   usuarios: [
       { "id": generateUUID (), "login": "admin", "senha": "123", "nome": "Administrador do Sistema", "email": "admin@abc.com"},
       { "id": generateUUID (), "login": "user", "senha": "123", "nome": "Usuario Comum", "email": "user@abc.com"},
   ]
};
```

## Calendário

Consiste em uma aba do nosso projeto, com o intuito apenas de se localizar nas datas, pois a organização
com alocação será feita na aba “Serviços Agendados”, portanto, o calendário será utilizado apenas para localizar a data e seus respectivos dias da semana.
O primeiro teste deverá ser feito consultando o código, verificando se as datas estão sendo geradas por constantes em JS, o segundo teste é verificar se a
data mostrada no calendário é a data atual de quando você estiver corrigindo e o terceiro teste é conferir o calendário do mês de fevereiro para examinar se
os dias no calendário estão corretos, pois fevereiro é o único mês do ano com menos de 30 dias!



Desenvolvedor Responsável: Lucas Maia Rocha

> Funcionalidade disponível em: https://lucasmaiia.github.io/TIAW-Calendario/

<img src="https://github.com/ICEI-PUC-Minas-PMGCC-TI/tiaw-pmg-cc-m-20212-trabalho-autonomo/blob/596c2d6c95e7eff72dce99f85c320d50c4c0d130/Documentacao/images/Funcionalidades/Calend%C3%A1rio.png" width="600">

### Estrutura de Dados:
``` javascript
const renderCalendar = () => {

    date.setDate(1);

    const monthDays = document.querySelector('.days');

    const lastDay = new Date(date.getFullYear(), date.getMonth() + 1, 0).getDate();

    const prevLastDay = new Date(date.getFullYear(), date.getMonth(), 0).getDate();

    const firstDayIndex = date.getDay();

    const lastDayIndex = new Date(date.getFullYear(), date.getMonth() + 1, 0).getDay();

    const nextDays = 7 - lastDayIndex - 1;

    const months = [
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro",
    ];
```


