import '@/assets/main.css'
import 'animate.css';
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from '@/App.vue'
//导入路由
import router from '@/router'
// 导入 Element Plus 图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
// 跨浏览器的 CSS 动画库

const app = createApp(App)

app.use(createPinia())
//应用路由
app.use(router)

app.mount('#app')
// 引入图标
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}