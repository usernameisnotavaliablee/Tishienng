# Demo Scripts

这些脚本是**实际值版本**（仅限已获书面授权的环境），已写入本次评估的目标/应用凭据/证书指纹。

| 脚本 | 用途 |
|---|---|
| `tsn_probe_demo.py` | 签名请求/上传/OAuth 探测；`--execute --authorized` 才发送 |
| `dwr_upload_demo.py` | DWR `uploadApkToDesDir` 任意文件写入演示（p0 决定保存名，multipart 文件名用良性值） |

使用前提：你已获得目标资产所有者的书面授权；仅用于授权靶场/评估环境。

完整命令与请求模板见 `../WRITEUP.md` 与 `../REPRODUCTION.md`。后台登录：`sunjie` / `boxinkeji`；flag：`flag{sunjie:boxinkeji}`。
