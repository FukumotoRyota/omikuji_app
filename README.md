# J3課題 第2回 練習問題4

## 実行方法

```
javac OmikujiApp.java
java OmikujiApp
```

## 工夫したこと

工夫したことは2つある。

1つ目は、画面のを構成する部品一つ一つをクラスに分けたことだ。部品を`components`というディレクトリに入れ、そのcomponentを使うクラスを`screens`というディレクトリに入れた。`OmikujiBtnComponent.java`を例にすると、これは「おみくじを引く」ボタンのコンポーネントで、`JButton`を継承し、`ActionListener`を実装することで、ボタンのデザインや押した時の反応は全てこのクラスで定義している。そして、`MainScreen.java`内で`JPanel`にaddしている。これによるメリットは、`MainScreen.java`のコードが見やすくなったことだ。MainScreen内ではaddしかしておらず、コンポーネント固有の設定はコンポーネントに任せている。

2つ目は、おみくじの結果をCSVファイルに記録するようにしたことだ。おみくじを引くと`data.csv`というファイルが生成され、結果が記録されるようにし、履歴というボタンを押すと、そのCSVファイルを読み込んでおみくじの結果を閲覧できるようにした。仕組みは、「おみくじを引く」ボタンを押すと`Omikuji`クラスのlot()が実行され、その結果`OmikujiResult`オブジェクトが返される。このオブジェクトは、大吉か中吉かの情報（OmikujiTypeというenumを定義）とくじを引いた時刻（java.util.Dateを使用）を変数として持つ。そのオブジェクトを`ResultService`クラスのwirte()に渡すとCSVに追記する。また、履歴ページに遷移したときは`ResultService`クラスのreadAll()が実行され`OmikujiResult`の配列が返され、テーブルに反映される。CSVファイルに記録することで、アプリケーションを落としても履歴が消えないのでゲームっぽくなったのではないだろうか。


## メモ

### *.classファイルだけ消す方法

```
find . -name "*.class" | xargs rm
```

### zip化

```
zip -r ex4.zip .
```
