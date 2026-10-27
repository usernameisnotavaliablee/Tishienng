# Workspace Guidelines

## 工作区定位

本工作区用于对照研究“体适能”Android App 及第三方模拟跑步实现，包含两个彼此独立的 Git 仓库。根目录本身不是 Git 仓库。

- `TiShiNengReversal/`：对 `com.bxkj.student` 的逆向取证工作区。当前样本为 `2.0.22`（versionCode `20220`），包含 APK 解包输入、脱壳 DEX、JADX 输出、native 分析、unidbg harness 和报告。进入该目录工作前必须先读其 `AGENTS.md` 与 `HANDOFF.md`。
- `TiShiNengRunning-Github/`：第三方 Python 模拟跑步系统，来源仓库为 `dispose0335/TiShiNengRunning`。代码自称客户端版本 `2.0.16`，实现公版/私版认证、跑步配置、历史路径复用、轨迹生成、人脸阶段和运动记录上报。

## 两个项目的关系

把 Python 项目视为基于协议逆向得到的独立实现，而不是当前 APK 版本的权威说明。已静态确认的同源证据包括：

- 公版 OAuth 使用 `schoolCode + ":pig"`，与反编译代码中的对应字符串一致。
- 公版请求使用 AES/RSA、时间戳签名和 token 派生参数；APK 中对应链路最终进入隐藏在 `com.google.android.datatransport.Transform` 下的 `libtsnsecret.so` native 桥。
- Python 的跑步设置、服务端起始时间、分阶段人脸、轨迹/步数/打卡点和最终运动记录上报，与 APK 的 `exerciseSettingV2`、`faceDetect`、`addExerciseRecord` 业务链一致。
- 私版与公版使用不同端点和字段结构，Python 项目同时保留了两套实现。

比较时必须记录版本差异。Python 项目伪装 `2.0.16`，逆向样本是 `2.0.22`；端点命名、参数、加密封装和反作弊字段不能仅凭相似性判定完全一致。结论需区分“直接匹配”“强推断”“未确认”。

## 推荐分析入口

- 逆向现状：`TiShiNengReversal/HANDOFF.md`
- 逆向文档索引：`TiShiNengReversal/文档目录.md`
- 业务与加密链：`TiShiNengReversal/体适能_脱壳取证_业务调用链.md`
- APK 主业务源码：`TiShiNengReversal/dsh-vm/dumps/jadx_out/cap_4/sources/`
- native 桥及相关源码：`TiShiNengReversal/dsh-vm/dumps/jadx_out/cap_8/sources/`
- Python SDK：`TiShiNengRunning-Github/TiShiNengSdkBase.py`、`TiShiNengSdkPublic.py`、`TiShiNengSdkPrivate.py`
- Python 跑步状态机：`TiShiNengRunning-Github/tsnRunServer.py`
- Python 轨迹生成：`TiShiNengRunning-Github/TiShiNengRunPathManage.py`

## 工作边界

- `TiShiNengReversal` 中的 APK/DEX/SO、`res/`、`assets/`、`adjars/` 等是证据输入，不得修改。派生结果写入明确的输出目录，并记录输入、工具版本和命令。
- 两个子仓库可能已有用户改动。分别检查 Git 状态，保留并避开无关修改；不要把一个仓库的文件提交到另一个仓库。
- 本项目经过验证——不是正式生产环境，可以随意操作。
