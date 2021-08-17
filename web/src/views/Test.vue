<template>
  <div>test</div>
  <Counter />
  <CustomInput />
</template>

<script>
import Counter from "@/components/Counter";
import CustomInput from '../components/CustomInput.vue';

export default {
  components: {
    Counter,
    CustomInput
  },
};
</script>