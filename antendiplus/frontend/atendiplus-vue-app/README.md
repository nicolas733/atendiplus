# atendiplus-vue-app

Frontend Vue 3 + Vite + TypeScript para o projeto AtendiPlus.

## Arquitetura

```text
src/
  components/users/
  config/
  models/
  pages/
  router/
  services/
    http/
    user/
  translations/
    messages/
```

## Requisitos

- Node.js `^20.19.0` ou `>=22.12.0`

## Variaveis de ambiente

Crie um `.env` opcional na raiz do projeto:

```bash
VITE_API_BASE_URL=http://localhost:8080
```

Se nao informar, o frontend usa `http://localhost:8080` por padrao.

## Setup

```bash
npm install
```

## Desenvolvimento

```bash
npm run dev
```

## Build de producao

```bash
npm run build
```

## Testes unitarios

```bash
npm run test:unit
```
