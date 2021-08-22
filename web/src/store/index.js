import { createStore } from "vuex";
import testApi from "../api/test-api";

// Create a new store instance.
const store = createStore({
  state() {
    return {
      count: 0,
    };
  },
  mutations: {
    increment(state) {
      state.count++;
    },
  },
  actions: {
    get() {
      return testApi.get().then();
    },
  },
});

export default store;
