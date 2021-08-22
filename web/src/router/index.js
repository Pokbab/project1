import { createWebHistory, createRouter } from "vue-router";

const routes = [
  {
    path: "/home",
    name: "Home",
    component: () => import("@/views/Home"),
  },
  {
    path: "/test",
    name: "test",
    component: () => import("@/views/Test"),
  },
  {
    path: "/members",
    component: () => import("@/views/MemberList"),
    children: [
      {
        path: "/members/:name",
        component: () => import("@/views/MemberDetail"),
      },
    ],
  },
  {
    path: "/component-test",
    name: "test",
    component: () => import("@/views/ComponentTest"),
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;

