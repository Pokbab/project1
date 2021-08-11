import { createWebHistory, createRouter } from "vue-router";

const routes = [
  {
    path: "/",
    name: "Home",
    component: () => import("@/views/Home"),
  },
  { path: "/test", component: () => import("@/views/Test") },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;