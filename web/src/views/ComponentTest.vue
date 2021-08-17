<template>
    <div>{{ count }}</div>
</template>

<script>
import { mapMutations, mapState } from "vuex";

export default {
    computed: mapState({
        count: state => state.count
    }),
    methods: {
        ...mapMutations(['increment'])
    }
}
</script>