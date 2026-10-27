# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 项目性质

这是一个 **Android APK 逆向取证工作区**，不是可编译的 Gradle 应用。目标应用为"体适能"（`com.bxkj.student`），一款校园体育打卡 App。

本仓库包含：
- 解包后的 APK 证据文件（`AndroidManifest.xml`、`classes.dex`、`res/`、`lib/`、`assets/` 等）
- 逆向分析脚本（Python）
- 取证报告与交接文档（Markdown）
- 脱壳产物与反编译源码（`dsh-vm/dumps/`）
- Native 算法验证工程（`unidbg_harness/`）

**重要**：所有工作均在本地沙箱完成，不对线上服务发起主动请求，不重打包分发。

## 当前状态（2026-08-15）

**核心取证目标已完成**（第 8 轮）：
- 360 壳已脱：cap_4（主业务 7027 类）、cap_8（acse 灰产 SDK 6331 类），方法体完整
- Native 鉴权链已由 unidbg 动态验证闭环
- Acse SDK 已代码级实锤为无障碍自动点击 + 电商导流 + 广告刷量 SDK
- Native 入口映射、SO 排除表、URL 复核全部完成

第 9 轮方案（acse native 实现定位）已规划但**未授权未执行**。

详细状态见 `HANDOFF.md`（唯一交接文档）。

## 常用命令

### 反汇编与分析
```bash
# DEX 结构探测
python3 probe_dex_structure.py classes.dex

# AXML 解码
python3 axml_decode.py AndroidManifest.xml > out/manifest_decoded.xml

# SO 侦察与反汇编
python3 so_recon.py lib/arm64-v8a/libtsnsecret.so
python3 disasm_so.py lib/arm64-v8a/libtsnsecret.so --list 'auth|AES'
