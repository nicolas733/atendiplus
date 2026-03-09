export interface User {
  id: number
  nome: string
  login: string
}

export interface CreateUserPayload {
  nome: string
  login: string
  senha: string
}

