<script setup>
import { ref } from 'vue'
import userService from '@/services/userService'
import { useRouter } from 'vue-router'

const router = useRouter()
const usuario = ref({
  nome: '',
  login: '',
  senha: ''
})

const cadastrar = async () => {
  try {
    await userService.cadastrarUsuario(usuario.value)
    alert('Usuário cadastrado com sucesso!')
    router.push('/')
  } catch (error) {
    alert('Erro ao cadastrar usuário')
    console.error(error)
  }
}
</script>

<template>
  <div class="container">
    <h2>Cadastrar Novo Usuário</h2>
    <form class="form" @submit.prevent="cadastrar">
      <label>Nome</label>
      <input v-model="usuario.nome" required />
      <br />
      <label>Login</label>
      <input v-model="usuario.login" required />
      <br />
      <label>Senha</label>
      <input type="password" v-model="usuario.senha" required />
      <br />
      <button class="button" type="submit">Cadastrar</button>
    </form>
  </div>
</template>
