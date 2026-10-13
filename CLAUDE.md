# CLAUDE.md

工作区总则见 `AGENTS.md`（先读）。

本目录本身不是 Git 仓库，含两个互相独立的 Git 仓库：

- `TiShiNengReversal/` — 体适能 APK 静态逆向取证（本地约 13 GB 证据，远程为私有仓库）。动手前先读其 `AGENTS.md` 与 `HANDOFF.md`。
- `TiShiNengRunning-Github/` — Python 模拟跑步客户端，上游 `dispose0335/TiShiNengRunning`。

硬性约束：只做本地静态分析，不碰生产接口；证据输入不得修改；凭据/密钥不得出现在提交、日志或报告中；改动只进对应子仓库。
