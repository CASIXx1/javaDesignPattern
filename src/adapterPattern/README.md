Adapterパターンを使って実装してみました。

#概要説明
##最初のシステム
日本だけで使われるECのレジシステムを想定しています。
Productクラスを継承したクラスを製品
Calculateクラスで選んだ製品の合計金額を計算して、円を返します。

##改変後のシステム
本システムを日本以外でも使うことになりました。
よって、Calculateで計算した合計金額（円）を合計金額（$や€など）に変換するクラスが必要となりました。
それは、GlobalCalculateインターフェースを実装、Calculateクラスを継承したクラスとします。

#メモ
既存クラスをそのまま残して、それを利用するような新しいクラスを作る。
メソッド名は同じだけど、機能は同じようにする