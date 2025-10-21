import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '@/views/HomeView.vue'
import CadastroView from '@/views/CadastroView.vue'

const routes = [
  { path: '/', name: 'home', component: HomeView },
  { path: '/cadastro', name: 'cadastro', component: CadastroView }
]

export default createRouter({
  history: createWebHistory(),
  routes
})
