<template>
  <div>
    <nav class="nav-bar">
      <router-link to="/">{{ t('nav.home') }}</router-link>
      <router-link to="/cadastro">{{ t('nav.cadastro') }}</router-link>
      <label class="locale-switcher" for="locale">
        {{ t('nav.language') }}
        <select id="locale" v-model="currentLocale">
          <option value="pt">PT</option>
          <option value="en">EN</option>
        </select>
      </label>
    </nav>
    <main class="app-content">
      <router-view />
    </main>
  </div>
</template>

<script setup lang="ts">
import { computed } from 'vue'
import { useI18n } from 'vue-i18n'
import type { SupportedLocale } from '@/translations'

const { locale, t } = useI18n()

const currentLocale = computed({
  get: () => locale.value as SupportedLocale,
  set: (value: SupportedLocale) => {
    locale.value = value
  }
})
</script>
