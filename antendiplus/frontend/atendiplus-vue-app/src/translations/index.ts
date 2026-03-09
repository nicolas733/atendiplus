import { createI18n } from 'vue-i18n'
import en from '@/translations/messages/en'
import pt from '@/translations/messages/pt'

export type SupportedLocale = 'pt' | 'en'

export const i18n = createI18n({
  legacy: false,
  locale: 'pt',
  fallbackLocale: 'en',
  messages: {
    pt,
    en
  }
})

