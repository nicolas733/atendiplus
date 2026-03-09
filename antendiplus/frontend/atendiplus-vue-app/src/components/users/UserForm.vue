<script setup lang="ts">
import { reactive } from 'vue'
import { useI18n } from 'vue-i18n'
import { useRouter } from 'vue-router'
import type { CreateUserPayload } from '@/models/user'
import { createUser } from '@/services/user/userService'

const router = useRouter()
const { t } = useI18n()

const user = reactive<CreateUserPayload>({
  nome: '',
  login: '',
  senha: ''
})

async function submit() {
  try {
    await createUser(user)
    window.alert(t('messages.createSuccess'))
    router.push({ name: 'home' })
  } catch (error) {
    console.error(error)
    window.alert(t('messages.createError'))
  }
}
</script>

<template>
  <div class="container">
    <h2>{{ t('form.title') }}</h2>
    <form class="form" @submit.prevent="submit">
      <label for="nome">{{ t('form.name') }}</label>
      <input id="nome" v-model="user.nome" required />

      <label for="login">{{ t('form.login') }}</label>
      <input id="login" v-model="user.login" required />

      <label for="senha">{{ t('form.password') }}</label>
      <input id="senha" v-model="user.senha" type="password" required />

      <button class="button" type="submit">{{ t('form.submit') }}</button>
    </form>
  </div>
</template>

