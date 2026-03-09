import { apiClient } from '@/services/http/apiClient'
import type { CreateUserPayload, User } from '@/models/user'

const userBasePath = '/usuario'

export async function listUsers(): Promise<User[]> {
  const { data } = await apiClient.get<User[]>(`${userBasePath}/listarUsuarios`)
  return data
}

export async function createUser(payload: CreateUserPayload): Promise<User> {
  const { data } = await apiClient.post<User>(`${userBasePath}/cadastrar`, payload)
  return data
}

export async function deleteUser(id: number): Promise<void> {
  await apiClient.delete(`${userBasePath}/${id}`)
}

