import { createRouter, createWebHistory } from 'vue-router'
import Index from '@/pages/frontend/index.vue'
import Login from '@/pages/admin/login.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: Index,
      meta:{
        title:"weblog 首页"
      }
    },{
      path: '/login', // 登录页
      component: Login,
      meta: {
          title: 'Weblog 登录页'
      }
    },
  ]
})

export default router
