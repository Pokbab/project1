<template>
    <div>{{ count }}</div>
    <div>
        <button @click="count += 1">+</button>
        <button @click="increment">+</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            count: 0
        }
    },
    computed: {
    },
    methods: {
        increment() {
            this.count++
        }
    }
}
</script>