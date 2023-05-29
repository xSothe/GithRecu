EjercicioGit4

1.Creamos una carpeta de trabajo con:
Dos carpetas (Ordenador1 y Ordenador2), que simularán dos equipos remotos.
Este README.md para ir editándolo y creando el registro de trabajo con capturas.
Una carpeta "img" para las imágenes que serán referenciadas desde el README
[![image1.png](https://i.postimg.cc/YCDcxmGx/image1.png)](https://postimg.cc/YvFyr0x4)



2.Creamos un repositorio vacío (sin README ni gitignore) en GitHub
[![image20.png](https://i.postimg.cc/QtXyG8TM/image20.png)](https://postimg.cc/QBybcrSL)

3.Creamos un proyecto de IntelliJ en Ordenador1 con repositorio de Git y código de ejemplo.
[![image27.png](https://i.postimg.cc/c1zXTMXC/image27.png)](https://postimg.cc/xqKv1HrV)




4.Creamos un nuevo README.md localmente (no el presente con el registro de trabajo, que se añadirá al final sustituyendo a ese.)
Creamos el README.md desde el proyecto en intellinj
[image23.png](https://postimg.cc/mczMf13q)



5.Realizamos un primer commit y push de la base del proyecto.
Primer commit proyecto base con hola mundo
[![image36.png](https://i.postimg.cc/PrGFTQZc/image36.png)](https://postimg.cc/Hj2tt564)

git status
git add .
git commit -m "proyecto base hola mundo"

Una vez que realizamos el commit lo puseamos a nuestro repositorio remoto
[![image18.png](https://i.postimg.cc/Y0BfK8Vz/image18.png)](https://postimg.cc/5YpF85fX)


git remote add origin https://github.com/xSothe/GithRecu
git push -u origin master

6.Clonamos el proyecto dentro de Ordenador2 y lo abrimos.
[![image31.png](https://i.postimg.cc/d1jD3B3B/image31.png)](https://postimg.cc/5Yjfk8wY)

git clone https://github.com/xSothe/GithRecu
7.Creamos una nueva funcionalidad, para lo cual creamos una rama "feat_persona" y la desarrollamos (ver mi log de commits). Una vez lista subimos la rama (git push feat_persona). Después, nos movemos a master para hacer un merge de "feat_persona" localmente. Al no haber nuevos commits en master, el merge debería ser automático y sin conflictos. Después del merge, hacemos un push de master con los nuevos cambios añLa rama es Feat persona pero tuve q repetir el proyecto por un problemilla que me dio intellijadidos.
[![image22.png](https://i.postimg.cc/3JVrK69h/image22.png)](https://postimg.cc/LnkFDxrQ)



Primer paso:creamos la rama "feat_persona"



git branch feat_persona o git checkout -b feat_persona:  "te lo crea y cambia directamente a la rama "feat_persona""
git checkout feat_persona - cambia de rama "feat_persona"

      2.Segundo paso:Creamos el objeto Persona.java y editamos Main.java, lo  ejecutamos.

Segundo commit probando un objeto Persona
git status
git add .
git commit -m "probando un objeto Persona"
Nos queda subir la rama feat persona
git push --set-upstream origin feat_persona o git push -u origin feat_persona
[image2.png](https://postimg.cc/Rq93GDY2)

Tercer paso:Nos cambiamos a la rama master, hacemos un merge
[![image25.png](https://i.postimg.cc/ncG8WP5T/image25.png)](https://postimg.cc/MvHrMdzj)

git checkout master
git merge feat_persona

Ahora nos queda hacer un push para subirlo a remoto
git push

8.Volvemos a Ordenador1. Recordamos el estado de nuestro proyecto en este ordenador haciendo un git status y un git log. Si no nos indica que el master local está por detrás del remoto (origin/master), será necesario hacer un git fetch.
primer paso
Nos volvemos al directorio ordenador1
[![image17.png](https://i.postimg.cc/6pFhf90P/image17.png)](https://postimg.cc/qNXnkHWc)

```bash
git status
git log - para ver los commits en la rama correspondiente
git fetch - Para comprobar los cambios echos
```
9.Para poder seguir trabajando desde Ordenador1, deberíamos hacer antes de nada un pull para traernos el nuevo commit que tiene master en remoto. Sin embargo, vamos a probar qué sucedería si nos olvidamos de ello.
Este paso no lo saltamos
[![image32.png](https://i.postimg.cc/vZnnM5rP/image32.png)](https://postimg.cc/gxYjHXBR)

git pull - Nos descarga los cambios mas rencientes de remoto a local
10. Desarrollamos una nueva funcionalidad "feat_empleado" en su correspondiente rama.
11.Primer paso
Creamos la rama feat_empleado y nos cambiamos a rama feat_empleado
git branch feat_empleado o git checkout -b feat_empleado
git checkout feat_empleado
[image38.png](https://postimg.cc/vDJ3TM2C)

Durante el desarrollo, antes de hacer el primer commit en feat_empleado, detectamos que el fichero .idea/workspace.xml cambia automáticamente a menudo al abrir el proyecto en IntelliJ (es un archivo de metadatos de proyecto de IntelliJ).
Segundo paso
Editamos .gitignore y añadimos .idea/workspace - para que suba en remoto los cambios echos por cada cambio que hagamos.
[![image14.png](https://i.postimg.cc/Kz1fP1XC/image14.png)](https://postimg.cc/qhd20MvG)

Hacemos un primer commit para añadir .idea/workspace.xml al .gitignore. Además, como los ficheros de ese directorio ya se han añadido previamente al repositorio, tendremos que eliminarlos de él haciendo:
[![image15.png](https://i.postimg.cc/YSsfCt4R/image15.png)](https://postimg.cc/R3wnP5LJ)

git rm --cached .idea/workspace.xml
Tercer paso
Nos queda añadir el commit añadido workspace.xml a gitignore
[image21.png](https://postimg.cc/f35MW8wg)

git status
git add 
git commit -m "añadido workspace.xml a gitignore"
Hacemos los otros 2 commits y pusheamos.
Tercer paso
Creamos el objeto Empleado.java y editar el Main.java
Nos queda añadir el commit probando objeto empleado
[![image35.png](https://i.postimg.cc/KY2hsyc9/image35.png)](https://postimg.cc/75mRfd27)

git status
git add 
git commit -m "probando objeto empleado"
Volvemos a Editar Empleado.java y Main.java
Nos queda añadir el commit encapsulando toString de Empleado


git status
git add
git commit -m "encapsulando toString de Empleado"
[![image6.png](https://i.postimg.cc/vmZwdt99/image6.png)](https://postimg.cc/0zFBYmV2)
Último nos queda subir la rama correspondiente feat_empleado
git push --set-upstream origin feat_empleado o git push -u origin feat_empleado
Vemos todas las ramas que tenemos.
[![image24.png](https://i.postimg.cc/nLZNGYTg/image24.png)](https://postimg.cc/FYWP9SMV)


5.Hacemos un checkout a master para mergear. Al hacer el push detectamos que hay un conflicto. Hemos olvidado de descargarnos los cambios que habíamos hecho en el otro ordenador y que tenemos subidos a GitHub.
Nos cambiamos a la rama master y hacemos un push "Nos da error porque no hicimos un pull para descargar los cambios en remoto a local, ahora tenemos conflicto con los nuevos cambios"
[![image3.png](https://i.postimg.cc/Qd89Tv1T/image3.png)](https://postimg.cc/mtngxXdL)

git checkout master
git push

Podríamos hacer un pull, que implicaría un merge de la rama remota a la rama local, como ya hemos visto, pero para hacerlo bien, vamos a eliminar los nuevos commits de master (siguen en feat_empleado, así que no se pierden). Para ello, usamos un git reset --hard desde master, volviendo al último commit común al master remoto.


git reset --hard
[![image33.png](https://i.postimg.cc/Z5gxTTvc/image33.png)](https://postimg.cc/ZW8dHzcB)


Ahora sí podemos hacer un pull de master sin conflicto.
git pull
[![image34.png](https://i.postimg.cc/g0gdwTdN/image34.png)](https://postimg.cc/d7Zgpnhy)



git merge feat_empleado
Terminamos el merge con add y commit, y hacemos un push.
Editamos el Main.java y solventamos los confictos, añadimos el commit Merge remote-tracking branch 'origin/feat_empleado' y lo psueamos
git status
git add 
git commit -m "Merge remote-tracking branch 'origin/feat_empleado'"
git push
Volvemos a Ordenador2 y comprobamos si tenemos todo al día con git status y git log. Si no nos indica que el master local está por detrás del remoto, será necesario hacer un git fetch, que ahora nos indicará que debemos hacer un pull.
git status
git log
git fetch
Comprobamos que hay un conflicto al intentar hacer un git pull, para descargar los cambios de remoto a local
git pull
Ahora vamos a simular cómo se desarrollaría en paralelo en varias ramas (distintas personas). No crearemos carpetas que simulen ordenadores pero cada rama representará el trabajo independiente de cada componente del equipo de trabajo.
Creamos dos ramas desde master, que desarrollaremos sin hacer merge a master (simulando otro desarrollador trabajando en paralelo):
Primer paso
crear las dos ramas feat_inmutable_fields y bug_edad_negativa
git branch feat_inmutable_fields o git checkout -b feat_inmutable_fields
git branch bug_edad_negativa o git checkout -b 

bug_edad_negativa"feat_inmutable_fields" para evitar que se pueda cambiar el nombre y la fecha de contratación de un empleado (asumimos que las especificaciones del proyecto lo impiden, sea o no razonable).
Segundo paso
Cambiar de rama feat_inmutable_fields
[![image8.png](https://i.postimg.cc/zXNJcWdw/image8.png)](https://postimg.cc/HjSDJJ1j)

git checkout feat_inmutable_fields
Tercer paso
Ahora editamos Main.java "para evitar cambiar la fecha"
Añadimos el commit diseñamos las pruebas de esta funcionalidad
git status
git add .
git commit "diseñamos las pruebas de esta funcionalidad"
[![image9.png](https://i.postimg.cc/1XrZQCWG/image9.png)](https://postimg.cc/m1kn3wWk)

Cuarto paso
Editamos Empleao.java y Main.java
Añadimos el commit ,ahora hay dos campos inmutables
git status
git add 
git commit "ahora hay dos campos inmutables"
[![image19.png](https://i.postimg.cc/RhHNLBZM/image19.png)](https://postimg.cc/PvdXd0Dc)


Lo último que nos queda es subir la rama correspondiente a remoto
git commit "push --set-upstream origin feat_inmutable_fields o git push -u origin feat_inmutable_fields"

"bug_edad_negativa", para asegurar que la edad de un empleado no pueda ser negativa.
Primer paso
nos cambiamos a la bug_edad_negativa
git checkout bug_edad_negativa
Segundo paso
Hay que editar  Main.java "para mostrar una prueba de error" y lo comiteamos, diseñamos la prueba que muestra el error
git status
git add 
git commit -m "diseñamos la prueba que muestra el error"

Tercer paso
Hay que editar Main.java y Empleado.java lo commiteamos information hidding:   la edad solo se puede modificar a través de un setter
git status
git add 
git commit -m "information hidding: edad es solo modificable a través de un setter"

Cuarto paso
Hay que editat Main.java y Empleado.java lo commiteamos y ya está resuelto
git status
git add 
git commit -m "resuelto"

Por último lo puseamos para subirlo a remoto
git push --set-upstream origin bug_edad_negativa

Cuando ya están desarrolladas, hay que hacer el merge de ambas ramas a master solventando conflictos.
Primer paso
Nos cambiamos a la rama master
Hacemos un merge feat_inmutable_fields
 Por último lo puseamos

git checkout master
git merge feat_inmutable_fields
git push
Segundo paso
Hacemos un merge bug_edad_negativa

git merge bug_edad_negativa
Tercer paso
Comprobamos que tenemos un conficto al hacer merge, nos toca solucionarlo
Editamos Main.java y Empleado.java, lo comiteamos Merge branch 'bug_edad_negativa', estaría solucionado el problema
git status
git add 
git commit -m "Merge branch 'bug_edad_negativa'"


Último lo puseamos para subirlo a remoto
git push
Realizamos otras mejoras en la rama feat_pojo para mostar el problema, los campos son privados y se accede mediante getters, y los mergeamos.
Primer paso
Creamos la rama feat_pojo y nos cambiamos a esta rama
git branch feat_pojo o git checkout -b feat_pojo
git checkout feat_pojo

Segundo paso
Modificamos Main.java y Empleado.java, para mostar el problemaLo comiteamos mostrando el problema
git status
git add 
git commit -m "mostrando el problema"

Tercer Paso
Modificamos Main.java y Empleado.Java, los campos ahora son privados y se acceden mediante getters
Lo comiteamos los campos son privados y se accede mediante getters
git status
git add 
git commit -m "los campos son privados y se accede mediante getters"

Lo puseamos para que lo suba a remoto
git push --set-upstream origin feat_pojo o git push -u origin feat_pojo
ültimo nos cambiamos a la rama master, lo mergeamos y nos queda psusearlo
git checkout maste
rgit merge feat_pojo
git push

Realizamos otras mejoras en la rama bug_deprecated_data_type para solucionar los problemas de la librería obsoleta java.util.Date, y los mergeamos.
Primer paso
Crear la rama bug_deprecated_data_type
git branch bug_deprecated_data_type o git checkout -b bug_deprecated_data_type
git checkout bug_deprecated_data_type
Segundo paso
Modificamos Main.java y lo comiteamos mostrando los problemas de Date![carpetas iniciales](img/54.png
git status
git add 
git commit -m "bug_deprecated_data_type"
Tercer paso
Modificamos Main.java Y Empleado.Java, lo comiteamos migrado a LocalDate





git status
git add 
git commit -m "migrado a LocalDate"
Nos queda subirlo a remoto la rama correspondiente











git push --set-upstream origin bug_deprecated_data_type o git push -u origin bug_deprecated_data_type
Cuarto paso
Nos cambiamos a la rama master, lo mergeamos y lo puseamos




git checkout master
git merge bug_deprecated_data_type
git push
 


