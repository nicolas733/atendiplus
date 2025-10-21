import axios from 'axios'

const API_URL = 'http://localhost:8080/usuario'

export default {
  // Listar todos os usuários
  async listarUsuarios() {
    const response = await axios.get(`${API_URL}/listarUsuarios`)
    return response.data
  },

  // Cadastrar novo usuário
  async cadastrarUsuario(usuario) {
    const response = await axios.post(`${API_URL}/cadastrar`, usuario)
    return response.data
  },

  // Excluir usuário por ID 
  async excluirUsuario(id) {
    const response = await axios.delete(`${API_URL}/${id}`)
    return response.data
  }
}
