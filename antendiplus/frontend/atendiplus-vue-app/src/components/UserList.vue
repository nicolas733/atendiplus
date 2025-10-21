<script setup>
import { ref, onMounted } from 'vue'
import userService from '@/services/userService'

const usuarios = ref([])

async function carregarUsuarios() {
  try {
    usuarios.value = await userService.listarUsuarios()
  } catch (error) {
    console.error('Erro ao carregar usuários:', error)
  }
}

async function excluirUsuario(id) {
  if (confirm('Tem certeza que deseja excluir este usuário?')) {
    try {
      await userService.excluirUsuario(id)
      await carregarUsuarios() // Atualiza a lista após exclusão
    } catch (error) {
      console.error('Erro ao excluir usuário:', error)
    }
  }
}

onMounted(carregarUsuarios)
</script>

<template>
  <div class="container">
    <h2>Lista de Usuários</h2>
    <table class="table" border="1" cellpadding="6">
      <thead>
        <tr>
          <th>ID</th>
          <th>Nome</th>
          <th>Login</th>
          <th>Ações</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="usuario in usuarios" :key="usuario.id">
            <td>{{ usuario.id }}</td>
            <td>{{ usuario.nome }}</td>
            <td>{{ usuario.login }}</td>
            <td>
                <button @click="excluirUsuario(usuario.id)">Excluir</button>
            </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
