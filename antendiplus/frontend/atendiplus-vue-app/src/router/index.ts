import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '@/pages/HomePage.vue'
import UserCreatePage from '@/pages/UserCreatePage.vue'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage
    },
    {
      path: '/cadastro',
      name: 'user-create',
      component: UserCreatePage
    }
  ]
})

export default router

