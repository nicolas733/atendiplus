<script setup lang="ts">
import { useI18n } from 'vue-i18n'
import UserForm from '@/components/users/UserForm.vue'

const { t } = useI18n()
</script>

<template>
  <section>
    <h1>{{ t('form.title') }}</h1>
    <router-link class="back-button" to="/">{{ t('form.back') }}</router-link>
    <UserForm />
  </section>
</template>

