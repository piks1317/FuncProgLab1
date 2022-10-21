module Task where

import Prelude
import Data.List ((:), List(..), reverse)

import Effect (Effect)
import Effect.Console (log)

singleton :: forall a. a -> List a
singleton a = (Cons a Nil)

null :: forall a. List a -> Boolean
null Nil = true
null _ = false

snoc :: forall a. List a -> a -> List a
snoc xs x = reverse (x : (reverse xs))

length :: forall a. List a -> Int -> Int
length Nil total = total
length (_ : tail) current = length tail (1 + current)

test :: Effect Unit 
test = do
  log $ show(length (Cons 4 (Cons 2 Nil)) 1)