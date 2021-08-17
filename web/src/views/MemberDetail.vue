<template>
    <div>{{ name }}</div>
</template>

<script>

export default {
    computed: {
        name() {
            return this.$route.params.name;
        }
    }
}
</script>