# Symbolitic

- [Symbolitic](#symbolitic)
  - [About the project](#about-the-project)
  - [Installation](#installation)
  - [Contribute](#contribute)
    - [Commit Format](#commit-format)

## About the project

This project is aimed at creating a sets of tools able to compute and solve variety of math problem algebraically. It will enable one to differentiate, factorize complexes expression easily and without requirement of any knowledge about the undergoing math.

## Installation

* Install the *Simple Build Tool* command line software. More information at [https://www.scala-sbt.org/](https://www.scala-sbt.org/). This is the tools used to build this project
  
* Clone this repository using the `git` command
```sh
git clone https://github.com/BoyeGuillaume/symbolitic.git
```

* Compile and run using sbt
```sh
sbt compile # compile the code source
sbt test # compile and run tests for this project
sbt run # run this project main (not yet available)
```

## Contribute

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
<br>

### Commit Format

Each commit must be well formed with a description following a pre-defined formatting :
```
<type>(optional scope): <description> (optional version increment)

[optional body]

[optional footer(s)]
``` 

Where :
* types are : `feat`, `fix`, `build`, `chore`, `ci`, `docs`, `style`, `refactor`, `perf`, `test`

* version increment are : `MAJOR`, `MINOR`, `PATCH`. *Note: that by default each commit is interpreted as a patch*



Example : 
```
change(server): drop support for HTTP (PATCH)
```

```
fix: prevent racing of requests

Introduce a request id and a reference to latest request. Dismiss
incoming responses other than from latest request.

Remove timeouts which were used to mitigate the racing issue but are
obsolete now.

Reviewed-by: Z
Refs: #123
```

```
feat: add database support to version <= 1.5.2 (MAJOR)
```
