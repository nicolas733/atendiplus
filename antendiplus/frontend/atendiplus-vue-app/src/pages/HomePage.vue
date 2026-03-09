<script setup lang="ts">
import { useI18n } from 'vue-i18n'
import UserList from '@/components/users/UserList.vue'

const { t } = useI18n()
</script>

<template>
  <section>
    <h1>{{ t('users.title') }}</h1>
    <div class="lock">
      <router-link class="button-link" to="/cadastro">{{ t('users.newUser') }}</router-link>
    </div>
    <UserList />
  </section>
</template>

