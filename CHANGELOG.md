# 修改摘要

- 初始提交：将 24 个文件添加到仓库，包含 `pom.xml`、源代码、资源以及 `.gitignore`。
- 将远程仓库从 SSH 切换为 HTTPS，并首次将 `main` 分支推送到远端。
- 配置 Git Credential Manager Core（GCM Core），以安全地保存 HTTPS 的凭据，便于日后推送与拉取。
- 目标：实现本地到远端的无缝推送，同时避免在仓库中暴露敏感信息。

后续动作建议
- 如有新的改动，按常规的 `git add`、`git commit`、`git push` 进行版本控制与推送。
- 如需进一步的凭据策略，请告知是否使用 PAT，以及是否在本地启用凭据管理器缓存。
