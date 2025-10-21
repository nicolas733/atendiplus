<template>
  <div>
    <h1>Usuários Cadastrados</h1>
    <div class="lock">
      <router-link class="boton" to="/cadastro">Cadastrar Novo Usuário</router-link>
    </div>
    <UserList />
  </div>
</template>

<script setup>
import UserList from '@/components/UserList.vue'
</script>

