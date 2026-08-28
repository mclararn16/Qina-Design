# Sistema de Acompanhamento de Pedidos — Qina Design

Sistema de acompanhamento de pedidos para a Qina Design, desenvolvido para automatizar e otimizar o tempo da equipe e facilitar a comunicação com o cliente. O sistema permite que o cliente acompanhe visualmente o andamento do seu pedido através de um link enviado via WhatsApp.

## 📋 Sobre o projeto

Atualmente, a comunicação sobre o andamento dos pedidos é feita de forma manual entre a equipe e o cliente, o que consome tempo dos funcionários e gera incertezas para o cliente. Este projeto resolve esse problema oferecendo um canal centralizado e visual de acompanhamento, reduzindo a necessidade de contato direto repetido com a equipe.

## ✨ Funcionalidades

- **Tela de acompanhamento** — exibe as etapas do pedido em andamento (ex: em produção, embalado, em transporte, entregue)
- **Acesso do cliente via número do pedido** — sem necessidade de cadastro
- **Atualização de status pelo funcionário** — o funcionário move o pedido entre as etapas
- **Tabela de acompanhamento de boletos** — exibe a situação financeira relacionada ao pedido
- **Login de funcionário via e-mail e senha** — acesso restrito à área administrativa

## 🚫 Fora de escopo (nesta versão)

- Pagamento ou emissão de boletos pelo sistema (apenas visualização de status)
- Chat ou atendimento em tempo real com o cliente
- Aplicativo mobile nativo
- Gestão interna de estoque ou produção

## 🛠️ Tecnologias utilizadas

> Node,js | React | Javascript | Java | 

| Camada | Tecnologia |
|---|---|
| Front-end | [PREENCHER] |
| Back-end | [PREENCHER] |
| Banco de dados | [PREENCHER] |
| Envio de mensagens (WhatsApp) | [PREENCHER: ex. API oficial, Twilio, etc.] |
| Hospedagem / Deploy | [PREENCHER] |

## 🏗️ Arquitetura

>Descrição geral da arquitetura

O sistema segue uma arquitetura monolítica em três camadas (front-end, back-end/API e banco de dados), escolhida por sua simplicidade de desenvolvimento, manutenção e hospedagem — adequada ao tamanho do time (5 desenvolvedores) e ao escopo do projeto.

Componentes:

**1.Camada de apresentação (front-end)**
*Interface do cliente:* acessada via link enviado por WhatsApp, exibe a tela de acompanhamento do pedido a partir do número informado, sem necessidade de login.
*Interface do funcionário:* acessada por e-mail e senha, permite atualizar o status do pedido e consultar a tabela de boletos.
**2.Camada de lógica (back-end/API)**
Recebe as requisições das duas interfaces.
Aplica as regras de negócio (ex: validação do número do pedido, controle de permissões do funcionário, transições válidas entre status).
Gera o link único de acompanhamento para cada pedido.
Integra-se com a API do WhatsApp para envio automático do link ao cliente.
**3.Camada de dados (banco de dados)**
Armazena as entidades principais: Cliente, Pedido, Status/Etapa do Pedido e Boleto.
Um banco de dados relacional é recomendado, dado que as entidades têm relacionamentos bem definidos (cliente → pedido → status/boletos).

Consulte a documentação completa do projeto (seção 3 — Arquitetura e Técnica) para os diagramas de arquitetura, modelo de dados (DER), casos de uso, classes e sequência.

## 🚀 Como rodar o projeto localmente

### Pré-requisitos

> [PREENCHER: ex. Node.js 18+, npm/yarn, banco de dados instalado, etc.]

### Instalação

```bash
# Clone o repositório
git clone [PREENCHER: url do repositório]

# Acesse a pasta do projeto
cd [PREENCHER: nome-da-pasta]

# Instale as dependências
[PREENCHER: ex. npm install]
```

### Variáveis de ambiente

Crie um arquivo `.env` na raiz do projeto com as seguintes variáveis:

```
[PREENCHER: ex. DATABASE_URL=]
[PREENCHER: ex. WHATSAPP_API_KEY=]
```

### Executando

```bash
[PREENCHER: comando para rodar o projeto, ex. npm run dev]
```

O projeto estará disponível em `[PREENCHER: ex. http://localhost:3000]`.

## 👥 Equipe e papéis (Scrum)

| Papel | Responsável |
|---|---|
| Product Owner | [PREENCHER] |
| Scrum Master | [PREENCHER] |
| Desenvolvedor(a) | [PREENCHER] |
| Desenvolvedor(a) | [PREENCHER] |
| Desenvolvedor(a) | [PREENCHER] |

## 📚 Documentação

A documentação completa do projeto (termo de abertura, requisitos, arquitetura, processo Scrum, testes e entrega) está disponível em: 


