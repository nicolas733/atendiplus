<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { useI18n } from 'vue-i18n'
import type { User } from '@/models/user'
import { deleteUser, listUsers } from '@/services/user/userService'

const users = ref<User[]>([])
const isLoading = ref(false)
const { t } = useI18n()

async function loadUsers() {
  isLoading.value = true

  try {
    users.value = await listUsers()
  } catch (error) {
    console.error(error)
    window.alert(t('messages.fetchError'))
  } finally {
    isLoading.value = false
  }
}

async function removeUser(id: number) {
  const shouldDelete = window.confirm(t('messages.confirmDelete'))

  if (!shouldDelete) {
    return
  }

  try {
    await deleteUser(id)
    await loadUsers()
  } catch (error) {
    console.error(error)
    window.alert(t('messages.deleteError'))
  }
}

onMounted(loadUsers)
</script>

<template>
  <div class="container">
    <h2>{{ t('users.listTitle') }}</h2>

    <p v-if="isLoading">Loading...</p>

    <p v-else-if="users.length === 0">{{ t('users.empty') }}</p>

    <table v-else class="table" border="1" cellpadding="6">
      <thead>
        <tr>
          <th>ID</th>
          <th>{{ t('form.name') }}</th>
          <th>{{ t('form.login') }}</th>
          <th>{{ t('actions.delete') }}</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in users" :key="user.id">
          <td>{{ user.id }}</td>
          <td>{{ user.nome }}</td>
          <td>{{ user.login }}</td>
          <td>
            <button class="button-inline" @click="removeUser(user.id)">
              {{ t('actions.delete') }}
            </button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

