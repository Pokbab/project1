import { createWebHistory, createRouter } from 'vue-router';

const routes = [
    { path: '/test', component: () => import('@/components/Test') }
  ]
  
  const router = createRouter({
    history: createWebHistory(),
    routes
  })

  export default router